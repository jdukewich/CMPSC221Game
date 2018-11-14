package model;

import exceptions.CantGoDirectionException;

public class Player extends MobileCharacter {
    public Player() {
        // We cannot initialize the current room yet.
    } /* end Player */

    public void go(Direction direction) {
        try {
            super.go(direction);
            getController().processGoDirectionSuccessful();
        } catch (CantGoDirectionException e) {
            getController().processCantGoDirection(e.getMessage());
        } /* end try */
    } /* end go */

    void initialize() {
        initializeCurrentRoom();
    } /* end initialize */

    protected void initializeCurrentRoom() {
        setCurrentRoom(getModel().getInitialPlayerRoom());
    } /* end initializeCurrentRoom */
} /* end Player */
