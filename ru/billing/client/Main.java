package billing.client;

import billing.stocklist.GenericItem;
import billing.stocklist.ItemCatalog;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ItemCatalog itemCatalog = new ItemCatalog();
        for(int i = 0; i < 10; i++)
            itemCatalog.addItem(new GenericItem());

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
        loader.load(itemCatalog);
        itemCatalog.printItems();
    }
}
