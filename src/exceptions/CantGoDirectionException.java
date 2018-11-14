package exceptions;

import model.Direction;

public class CantGoDirectionException extends Exception {
    public CantGoDirectionException(Direction direction) {
        super(direction.getName());
    } /* end CantGoDirectionException */
} /* end CantGoDirectionException */