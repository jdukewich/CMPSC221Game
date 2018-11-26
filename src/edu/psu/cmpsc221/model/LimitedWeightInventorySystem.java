package edu.psu.cmpsc221.model;

public class LimitedWeightInventorySystem extends InventorySystem {
    public LimitedWeightInventorySystem(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    protected boolean canAddItem(Item item) {
        return (item.getWeight() + super.list.stream().mapToInt(Item::getWeight).sum() <= maxWeight);
    }

    @Override
    protected String getInventoryFullMessage() {
        return "Your inventory is filled with maximum weight!";
    }

    private int maxWeight;
}
