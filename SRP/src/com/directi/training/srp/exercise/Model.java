package com.directi.training.srp.exercise;

public abstract class Model {
    private final String _id;

    public Model(String id) {
        _id = id;
    }

    public String getId(){
        return _id;
    }
}
