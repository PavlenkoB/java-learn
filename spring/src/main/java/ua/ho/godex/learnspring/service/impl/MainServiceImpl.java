package ua.ho.godex.learnspring.service.impl;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import ua.ho.godex.learnspring.service.MainService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class MainServiceImpl<T> implements MainService<T> {
    CrudRepository repository;

    protected abstract void initRepository();

    protected void setRepository(CrudRepository crudRepository) {
        this.repository = crudRepository;
    }

    @Override
    public List<T> getAll() {
        List<T> retList = new ArrayList<>();
        this.repository.findAll().forEach(e -> retList.add((T) e));
        return retList;
    }

    @Override
    public T create(T model) {
        T save = (T) this.repository.save(model);
        return save;
    }

    @Override
    public Optional<T> findById(Long id) {
        return this.repository.findById(id);
    }

    @Override
    public T update(T model) {
        return (T) this.repository.save(model);
    }

    @Override
    public void deleteById(Long id) {
        this.repository.deleteById(id);
    }
}
