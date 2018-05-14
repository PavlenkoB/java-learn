package ua.ho.godex.learnspring.service;

import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Optional;

public interface MainService<T> {
    @NonNull
    List<T> getAll();

    @NonNull
    T create(T model);

    @NonNull
    Optional<T> findById(Long id);

    @NonNull
    T update(T model);

    void deleteById(Long id);
}
