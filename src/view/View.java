package view;

public interface View {
    public String getUserCommand();
    public void look();
    public void processCantGoDirection(String directionName);
    public void processQuitCommand();
    public void processUnknownCommand(String command);
} /* end View */