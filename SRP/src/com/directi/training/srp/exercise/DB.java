package com.directi.training.srp.exercise;

import java.util.List;

public class DB<T extends Model> implements Databasable<T>
{
    private List<T> _records;

    public T findById(final String id)
    {
        for (T record : _records) {
            if (record.getId().equals(id)) {
                return record;
            }
        }
        return null;
    }

    public List<T> getAll() {
        return _records;
    }
}
