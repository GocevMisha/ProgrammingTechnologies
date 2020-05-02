package billing.client;

import billing.exceptions.CatalogLoadException;
import billing.stocklist.ItemCatalog;

public interface CatalogLoader {
    public void load(ItemCatalog cat) throws CatalogLoadException;
}
