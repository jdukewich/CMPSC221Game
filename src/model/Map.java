package model;

public class Map {
    public Map() {
        thomas101 = new Room("You are seated in 101 Thomas Building. It is brightly lit and " +
                "is the site of your favorite class OF ALL TIME.", "101Thomas");
        thomasHallway = new Room("You are in the main hallway of Thomas Bulding", "ThomasHallway");
        thomasEastExit = new Room("You are standing outside Thomas Building along Pollock Road", "thomasEastExit");
        mcElwainCourtyard = new Room("You are in McElwain's courtyard, a peaceful setting reminiscent of earlier times.", "McElwainCourtyard");

        thomas101.addCompassExit(CompassDirection.SOUTH, thomasHallway);
        thomasHallway.addCompassExit(CompassDirection.EAST, thomasEastExit);
        thomasEastExit.addCompassExit((CompassDirection.EAST), mcElwainCourtyard);

    } /* end Map */

    public Room getInitialPlayerRoom() {
        return thomas101;
    } /* end getInitialPlayerRoom */

    private Room thomas101;
    private Room thomasHallway;
    private Room thomasEastExit;
    private Room mcElwainCourtyard;
} /* end Map */