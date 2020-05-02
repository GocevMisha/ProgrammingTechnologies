package billing.client;

import billing.exceptions.CatalogLoadException;
import billing.exceptions.ItemAlreadyExistsException;
import billing.stocklist.GenericItem;
import billing.stocklist.ItemCatalog;

import java.util.Date;

public class Main {
    public static void main(String[] args)  {
        ItemCatalog itemCatalog = new ItemCatalog();
        for(int i = 0; i < 10; i++) {
            try {
                itemCatalog.addItem(new GenericItem());
            } catch (ItemAlreadyExistsException e) {
                e.printStackTrace();
            }
        }

        /*GenericItem test = new GenericItem();
        test.setID(0);
        try {
            itemCatalog.addItem(test);
        } catch (ItemAlreadyExistsException e) {
            e.printStackTrace();
        }*/
        CatalogStubLoader catalogStubLoader = new CatalogStubLoader();
        try {
            catalogStubLoader.load(itemCatalog);
        } catch (CatalogLoadException e) {
            e.printStackTrace();
        }
        long begin = new Date().getTime();
        for(int i=0; i<100000;i++)
            itemCatalog.findItemByID(1);
        long end = new Date().getTime();
        System.out.println("In HashMap: "+(end-begin));
        begin = new Date().getTime();
        for(int i=0; i<100000;i++)
            itemCatalog.findItemByIDAL(1);
        end = new Date().getTime();
        System.out.println("In ArrayList: "+(end-begin));
        CatalogLoader loader = new CatalogStubLoader();
        try {
            loader.load(itemCatalog);
        } catch (CatalogLoadException e) {
            e.printStackTrace();
        }
        itemCatalog.printItems();
    }
}
