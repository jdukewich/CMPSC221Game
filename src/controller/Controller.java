package controller;

import adventureobject.AdventureObject;
import model.Direction;
import model.Model;
import view.TextView;
import view.View;

public class Controller extends AdventureObject {
    public Controller() {
        initializeKeepPlaying();
        initializeParser();
        initializeView();
    } /* end Controller */

    public String getCurrentRoomLookDescription() {
        return getModel().getCurrentRoomLookDescription();
    } /* end getCurrentRoomLookDescription */

    public String getCurrentRoomLookExits() {
        return getModel().getCurrentRoomLookExits();
    } /* end getCurrentRoomLookExits */

    public static Controller getInstance() {
        return instance;
    } /* end getInstance */

    private boolean getKeepPlaying() {
        return keepPlaying;
    } /* end getKeepPlaying */

    private Model getModel() {
        return Model.getInstance();
    } /* end getModel */

    private Parser getParser() {
        return parser;
    } /* end getParser */

    private View getView() {
        return view;
    } /* end View */

    public void go(Direction direction) {
        getModel().go(direction);
    } /* end go */

    private void initializeKeepPlaying() {
        setKeepPlaying(true);
    } /* end initializeKeepPlaying */

    private void initializeParser() {
        parser = new Parser();
    } /* end initializeParser */

    private void initializeView() {
        view = new TextView();
    } /* end initializeView */

    private void parseCommand(String command) {
        getParser().parseCommand(command);
    } /* end parseCommand */

    public void processCantGoDirection(String directionName) {
        getView().processCantGoDirection(directionName);
    } /* end processCantGoDirection */

    public void processGoDirectionSuccessful() {
        getView().look();
    } /* end processGoDirectionSuccessful */

    public void processLook() {
        getView().look();
    } /* end processLook */

    private void processNextUserCommand() {
        String command = getView().getUserCommand();
        parseCommand(command);
    } /* end processNextUserCommand */

    public void processQuitCommand() {
        getView().processQuitCommand();
        setKeepPlaying(false);
    } /* end processQuitCommand */

    public void processUnknownCommand(String command) {
        getView().processUnknownCommand(command);
    } /* end processUnknownCommand */

    public void run() {
        getView().look();

        while (getKeepPlaying()) {
            processNextUserCommand();
        } /* end while */
    } /* end run */

    private void setKeepPlaying(boolean value) {
        keepPlaying = value;
    } /* end setKeepPlaying*/

    private static Controller instance = new Controller();
    private boolean keepPlaying;
    private Parser parser;
    private View view;
} /* end Controller */