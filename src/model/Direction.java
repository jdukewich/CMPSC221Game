package model;

/**
 * A general direction for the game
 */
public class Direction {
    public Direction(String name) {
        this.name = name;
    } /* end Direction */

    public String getName() {
        return name;
    } /* end getName */

    private String name;
} /* end Direction */