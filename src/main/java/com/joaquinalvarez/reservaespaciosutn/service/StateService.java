package com.joaquinalvarez.reservaespaciosutn.service;

import com.joaquinalvarez.reservaespaciosutn.model.entity.State;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StateService {

    State getById(Long id) throws Exception;
    List<State> findAll();
    State save(State state);
    State update(Long id, State state) throws Exception;
    void delete(Long id) throws Exception;


}
