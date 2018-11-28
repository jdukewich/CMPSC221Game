package edu.psu.cmpsc221.model;

public class LimitedWeightInventorySystem extends InventorySystem {
    public LimitedWeightInventorySystem(int maxWeight) {
        this.maxWeight = maxWeight;
    } /* end LimitedWeightInventorySystem */

    @Override
    protected boolean canAddItem(Item item) {
        return (item.getWeight() + super.list.stream().mapToInt(Item::getWeight).sum() <= maxWeight);
    } /* end canAddItem */

    @Override
    protected String getInventoryFullMessage() {
        return "Hit the gym! This item gives your inventory too much weight!";
    } /* end getInventoryFullMessage */

    private int maxWeight;
} /* end LimitedWeightInventorySystem */
