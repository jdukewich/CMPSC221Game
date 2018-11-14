package model;

import exceptions.CantGoDirectionException;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * This class models rooms in our adventure game
 */

public class Room {

    Room(String lookDescription, String name) {
        this.exits = new HashMap<>();
        this.lookDescription = lookDescription;
        this.name = name;
    } /* end Room */

    void addCompassExit(CompassDirection compassDirection, Room toRoom) {
        addExit(compassDirection, toRoom);
        toRoom.addExit(compassDirection.getOppositeCompassDirection(), this);
    } /* end addCompassExit */

    void addExit(Direction direction, Room toRoom) {
        exits.put(direction, toRoom);
    } /* end addExit */

    private Room getExitForDirection(Direction direction) throws CantGoDirectionException {
        Room candidateRoom = exits.get(direction);
        if (null == candidateRoom) throw new CantGoDirectionException(direction);
        return candidateRoom;
    } /* end getExitForDirection */

    private String getLookExits() {
        String lookExits = "Obvious exits are to the ";
        String exitsAsString =
                exits.keySet().stream().map(Direction::getName).collect(Collectors.joining(", "));
        lookExits += exitsAsString;
        return lookExits;
    } /* end getLookExits */

    public Room go(Direction direction) throws CantGoDirectionException {
        return getExitForDirection(direction);
    } /* end go */

    public String look() {
        return String.format("%s%n%s", lookDescription, getLookExits());
    } /* end look */

    private Map<Direction, Room> exits;
    private String lookDescription;
    private String name;

} /* end Room */