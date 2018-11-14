package model;

import adventureobject.AdventureObject;

public class ModelObject extends AdventureObject {
    protected Model getModel() {
        return Model.getInstance();
    } /* end getModel */
} /* ModelObject */
