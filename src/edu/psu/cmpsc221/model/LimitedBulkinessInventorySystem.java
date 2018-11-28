package edu.psu.cmpsc221.model;

public class LimitedBulkinessInventorySystem extends InventorySystem {
    public LimitedBulkinessInventorySystem(int maxBulk) {
        this.maxBulk = maxBulk;
    } /* end LimitedBulkinessInventorySystem */

    @Override
    protected boolean canAddItem(Item item) {
        return (item.getBulkiness() + super.list.stream().mapToInt(Item::getBulkiness).sum() <= maxBulk);
    } /* end canAddItem */

    @Override
    protected String getInventoryFullMessage() {
        return "Get bigger pockets! This item gives your inventory too much bulkiness!";
    } /* end getInventoryFullMessage */

    private int maxBulk;
} /* end LimitedBulkinessInventorySystem */
