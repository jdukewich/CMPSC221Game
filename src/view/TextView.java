package view;

import adventureobject.AdventureObject;
import java.util.Scanner;

public class TextView extends AdventureObject implements View {
    public TextView() {
        scanner = new Scanner(System.in);
    } /* end TextView */

    private String getLookString() {
        return String.format("%s%n%s", getController().getCurrentRoomLookDescription(), getController().getCurrentRoomLookExits());
    } /* end getLookString */

    private Scanner getScanner() {
        return scanner;
    } /* end getScanner */

    public String getUserCommand() {
        return getScanner().nextLine();
    } /* end getUserCommand */

    public void look() {
        output(getLookString());
    } /* end look */

    private void output(String string) {
        System.out.println();
        System.out.println(string);
    } /* end output */

    public void processCantGoDirection(String directionName) {
        output("OUCH! You bang your nose on the wall trying to go " + directionName);
    } /* end processCantGoDirection */

    public void processQuitCommand() {
        output("Bye bye");
    } /* end processQuitCommand */

    public void processUnknownCommand(String command) {
        output("I don't understand what you mean by \"" + command + "\"");
    } /* end processUnknownCommand */

    private Scanner scanner;
} /* end TextView */
