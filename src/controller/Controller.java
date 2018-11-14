package controller;

import exceptions.CantGoDirectionException;
import model.CompassDirection;
import model.Model;
import model.Room;

public class Controller {
    public static void run() {
        try {
            Controller controller = new Controller();
            Room currentRoom = controller.getModel().getInitialRoom();
            System.out.println(currentRoom.look());

            currentRoom = currentRoom.go(CompassDirection.SOUTH);
            System.out.println();
            System.out.println(currentRoom.look());

            currentRoom = currentRoom.go(CompassDirection.NORTH);
            System.out.println();
            System.out.println(currentRoom.look());
        } catch (CantGoDirectionException e) {
            System.out.println("You cannot go " + e.getMessage());
        }
        // TODO: Write me
    } /* end run */

    private Model getModel() {
        return Model.getInstance();
    } /* end getModel */
} /* end Controller */