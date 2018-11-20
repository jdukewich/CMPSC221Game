package model;

import exceptions.CantGoDirectionException;

public abstract class MobileCharacter extends ModelObject {
    protected MobileCharacter() {
        // Subclasses must independently initialize their current room.
    } /* end MobileCharacter */

    protected  Room getCurrentRoom() {
        return currentRoom;
    } /* end getCurrentRoom */

    public String getCurrentRoomLookDescription() {
        return getCurrentRoom().getLookDescription();
    } /* end getCurrentRoomLookDescription */

    public String getCurrentRoomLookExits() {
        return getCurrentRoom().getLookExits();
    } /* end getCurrentRoomLookExits */

    public String getCurrentRoomLookItems() {
        return getCurrentRoom().getLookItems();
    } /* end getCurrentRoomLookItems */

    protected void go(Direction direction) throws CantGoDirectionException {
        setCurrentRoom(getCurrentRoom().go(direction));
    } /* end go */

    protected abstract void initializeCurrentRoom();

    protected void setCurrentRoom(Room room) {
        currentRoom = room;
    } /* end setCurrentRoom */

    private Room currentRoom;
} /* end MobileCharacter */
