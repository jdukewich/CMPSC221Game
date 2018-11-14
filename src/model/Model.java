package model;

public class Model {
    protected Model () {
        map = new Map();
    } /* end Model */

    public static Model getInstance() {
        return instance;
    } /* end getInstance() */

    public Room getInitialRoom() {
        return map.getInitialRoom();
    } /* end getInitialRoom() */

    private static Model instance = new Model();
    private Map map;
} /* end Model */
