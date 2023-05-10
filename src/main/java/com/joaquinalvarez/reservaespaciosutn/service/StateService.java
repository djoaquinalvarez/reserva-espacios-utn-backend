package com.joaquinalvarez.reservaespaciosutn.service;

import com.joaquinalvarez.reservaespaciosutn.model.entity.State;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StateService {

    State getById(Long id);
    List<State> findAll();
    State save(State state);
    State update(Long id, State state);
    void delete(Long id);


}
