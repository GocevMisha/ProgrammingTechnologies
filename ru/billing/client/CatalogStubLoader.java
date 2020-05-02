package billing.client;

import billing.client.CatalogLoader;
import billing.exceptions.CatalogLoadException;
import billing.exceptions.ItemAlreadyExistsException;
import billing.stocklist.Category;
import billing.stocklist.FoodItem;
import billing.stocklist.GenericItem;
import billing.stocklist.ItemCatalog;

import java.util.Date;

public class CatalogStubLoader implements CatalogLoader {
    @Override
    public void load(ItemCatalog cat) throws CatalogLoadException {
        GenericItem item1 = new GenericItem("Sony TV&",23000, Category.GENERAL);
        GenericItem item3 = new GenericItem();
        item3.setID(item1.getID());
        FoodItem item2 = new FoodItem("Bread",12,null,new Date(),(short)10);
        try {
            cat.addItem(item1);
            cat.addItem(item2);
            cat.addItem(item3);
        } catch (ItemAlreadyExistsException e) { // TODO Auto-generated catch block
            e.printStackTrace();
            throw new CatalogLoadException(e);
        }
    }
}
