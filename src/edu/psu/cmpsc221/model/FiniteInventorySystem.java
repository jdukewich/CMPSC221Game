package edu.psu.cmpsc221.model;

public class FiniteInventorySystem extends InventorySystem {
    public FiniteInventorySystem(int maxItems) {
            this.maxItems = maxItems;
    } /* end FiniteInventorySystem */

    @Override
    protected boolean canAddItem(Item item) {
        return (super.list.size() != maxItems);
    } /* end canAddItem */

    @Override
    protected String getInventoryFullMessage() {
        return "Your inventory has the max number of items!";
    }

    private int maxItems;
}
