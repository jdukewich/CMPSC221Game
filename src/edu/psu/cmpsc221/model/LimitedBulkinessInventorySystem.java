package edu.psu.cmpsc221.model;

import java.util.stream.Collectors;

public class LimitedBulkinessInventorySystem extends InventorySystem {
    public LimitedBulkinessInventorySystem(int maxBulk) {
        this.maxBulk = maxBulk;
    }

    @Override
    protected boolean canAddItem(Item item) {
        return (item.getBulkiness() + super.list.stream().mapToInt(Item::getBulkiness).sum() <= maxBulk);
    }

    @Override
    protected String getInventoryFullMessage() {
        return "Your inventory is filled with maximum bulkiness!";
    }

    private int maxBulk;
}
