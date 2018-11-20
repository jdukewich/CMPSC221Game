package exceptions;

import model.Item;

public class ItemNotInInventoryException extends Exception {
    public ItemNotInInventoryException(String itemName) {
        super(itemName);
    } /* end ItemNotInInventoryException */

    public ItemNotInInventoryException(Item item) {
        super(item.getName());
    } /* end ItemNotInInventoryException */
} /* end ItemNotInInventoryException */
