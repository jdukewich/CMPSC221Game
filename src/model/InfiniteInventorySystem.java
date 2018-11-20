package model;

public class InfiniteInventorySystem extends InventorySystem {
    protected boolean canAddItem(Item item) {
        return true;
    } /* end canAddItem */

    protected String getInventoryFullMessage() {
        // Can't occur in this system
        return "";
    } /* end getInventoryFullMessage */
} /* end InfiniteInventorySystem */
