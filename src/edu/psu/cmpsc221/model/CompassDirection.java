package edu.psu.cmpsc221.model;

public class CompassDirection extends Direction {
    public static final String NORTH_NAME = "north";
    public static final String SOUTH_NAME = "south";
    public static final String EAST_NAME = "east";
    public static final String WEST_NAME = "west";

    public static final CompassDirection NORTH = new CompassDirection("north");
    public static final CompassDirection SOUTH = new CompassDirection("south");
    public static final CompassDirection EAST = new CompassDirection("east");
    public static final CompassDirection WEST = new CompassDirection("west");

    static {
        NORTH.setOppositeCompassDirection(SOUTH);
        SOUTH.setOppositeCompassDirection(NORTH);
        EAST.setOppositeCompassDirection(WEST);
        WEST.setOppositeCompassDirection(EAST);
    }

    public CompassDirection(String name) {
        super(name);
    } /* end CompassDirection */

    CompassDirection getOppositeCompassDirection() {
        return oppositeCompassDirection;
    } /* end getOppositeCompassDirection */

    private void setOppositeCompassDirection(CompassDirection compassDirection) {
        this.oppositeCompassDirection = compassDirection;
    }

    private CompassDirection oppositeCompassDirection;
} /* end CompassDirection */
