package com.joaquinalvarez.reservaespaciosutn.service.impl;

import com.joaquinalvarez.reservaespaciosutn.model.entity.State;
import com.joaquinalvarez.reservaespaciosutn.repository.StateRepository;
import com.joaquinalvarez.reservaespaciosutn.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StateServiceImpl implements StateService {

    @Autowired
    private StateRepository stateRepository;

    @Override
    public State getById(Long id) {
        return null;
    }

    @Override
    public List<State> findAll() {
        return stateRepository.findAll();
    }

    @Override
    public State save(State state) {
        return null;
    }

    @Override
    public State update(Long id, State state) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
