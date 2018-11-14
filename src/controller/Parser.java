package controller;

import adventureobject.AdventureObject;
import model.CompassDirection;
import model.Direction;

public class Parser extends AdventureObject {
    public void parseCommand(String command) {
        String[] commands = command.trim().toLowerCase().split(" ");

        if (commands.length > 0) {
            switch (commands[0]) {
                case "go" : processGo(commands); break;
                case CompassDirection.NORTH_NAME : processGo(CompassDirection.NORTH); break;
                case CompassDirection.SOUTH_NAME : processGo(CompassDirection.SOUTH); break;
                case CompassDirection.EAST_NAME : processGo(CompassDirection.EAST); break;
                case CompassDirection.WEST_NAME : processGo(CompassDirection.WEST); break;

                case "look" : getController().processLook(); break;

                case "quit" : getController().processQuitCommand(); break;

                default : getController().processUnknownCommand(command); break;
            } /* end switch */
        } /* end if */
    } /* end parseCommand */

    private void processGo(Direction direction) {
        getController().go(direction);
    } /* end processGo */

    private void processGo(String[] commands) {
        boolean wasCommandsProcessed = false;

        if (commands.length > 1) {
            switch (commands[1]) {
                case CompassDirection.NORTH_NAME : {
                    processGo(CompassDirection.NORTH);
                    wasCommandsProcessed = true;
                    break;
                } /* end case */

                case CompassDirection.SOUTH_NAME : {
                    processGo(CompassDirection.SOUTH);
                    wasCommandsProcessed = true;
                    break;
                } /* end case */

                case CompassDirection.EAST_NAME : {
                    processGo(CompassDirection.EAST);
                    wasCommandsProcessed = true;
                    break;
                } /* end case */

                case CompassDirection.WEST_NAME : {
                    processGo(CompassDirection.WEST);
                    wasCommandsProcessed = true;
                    break;
                }
            } /* end switch */
        } /* end if */

        if (!wasCommandsProcessed) getController().processUnknownCommand(String.join(" ", commands));
    } /* end processGo */
} /* end Parser */
