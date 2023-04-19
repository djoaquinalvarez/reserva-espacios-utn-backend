package com.joaquinalvarez.reservaespaciosutn.respository;

import java.util.List;

public interface Repository<T> {
    List<T> findAll();
    T add(T t);
    T update(T t);
    void delete(Long id);
}
