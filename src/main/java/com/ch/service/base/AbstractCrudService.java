package com.ch.service.base;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class AbstractCrudService implements CrudService {

    @Override
    public List listAll() {

        return null;
    }

    @Override
    public List listAllByIds(Collection ids) {
        return null;
    }

    @Override
    public Optional fetchById(Object id) {
        return Optional.empty();
    }

    @Override
    public Object getById(Object id) {
        return null;
    }

    @Override
    public Object getByIdOfNullable(Object id) {
        return null;
    }

    @Override
    public boolean existsById(Object id) {
        return false;
    }

    @Override
    public void mustExistById(Object id) {

    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public Object create(Object D) {
        return null;
    }

    @Override
    public List createInBatch(Collection Ds) {
        return null;
    }

    @Override
    public Object update(Object D) {
        return null;
    }


    @Override
    public List updateInBatch(Collection Ds) {
        return null;
    }

    @Override
    public Object removeById(Object id) {
        return null;
    }

    @Override
    public Object removeByIdOfNullable(Object id) {
        return null;
    }

    @Override
    public void remove(Object D) {

    }

    @Override
    public void removeInBatch(Collection ids) {

    }

    @Override
    public void removeAll(Collection Ds) {

    }

    @Override
    public void removeAll() {

    }
}
