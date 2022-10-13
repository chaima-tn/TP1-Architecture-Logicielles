package com.directi.training.srp.exercise;

import java.util.List;

public interface Databasable<T>
{
    public T findById(String id);

    public List<T> getAll();
}
