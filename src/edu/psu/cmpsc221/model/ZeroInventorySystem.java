package edu.psu.cmpsc221.model;

public class ZeroInventorySystem extends InventorySystem {
    protected boolean canAddItem(Item item) {
        return false;
    } /* end canAddItem */

    protected String getInventoryFullMessage() {
        return ("It Falls through my pockets and back onto the floor.");
    } /* end getInventoryFullMessage */
} /* end ZeroInventorySystem */
