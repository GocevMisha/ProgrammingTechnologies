package billing.stocklist;

import java.util.ArrayList;
import java.util.HashMap;

public class ItemCatalog {
    private HashMap<Integer, GenericItem> catalog = new HashMap <Integer,GenericItem>();
    private ArrayList<GenericItem> ALCatalog = new ArrayList<GenericItem>();

    public HashMap<Integer, GenericItem> getCatalog() {
        return catalog;
    }

    public void setCatalog(HashMap<Integer, GenericItem> catalog) {
        this.catalog = catalog;
    }

    public ArrayList<GenericItem> getALCatalog() {
        return ALCatalog;
    }

    public void setALCatalog(ArrayList<GenericItem> ALCatalog) {
        this.ALCatalog = ALCatalog;
    }

    public void addItem(GenericItem item) {
        catalog.put(item.getID(), item);
        ALCatalog.add(item);
    }

    public void printItems() {
        for (GenericItem i : ALCatalog) {
            System.out.println(i);
        }
    }

    public GenericItem findItemByID(int id) {
        return catalog.getOrDefault(id, null);
    }

    public GenericItem findItemByIDAL(int id) {
        for (GenericItem i : ALCatalog) {
            if (i.getID() == id) return i;
        }
        return null;
    }
}
