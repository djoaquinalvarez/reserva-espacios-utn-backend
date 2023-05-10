package com.joaquinalvarez.reservaespaciosutn.service.impl;

import com.joaquinalvarez.reservaespaciosutn.model.entity.Role;
import com.joaquinalvarez.reservaespaciosutn.model.entity.State;
import com.joaquinalvarez.reservaespaciosutn.repository.StateRepository;
import com.joaquinalvarez.reservaespaciosutn.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StateServiceImpl implements StateService {

    @Autowired
    private StateRepository stateRepository;

    @Override
    public State getById(Long id) throws Exception {
        Optional<State> stateFound = findAll().stream()
                .filter(r -> r.getId().equals(id))
                .findFirst();
        return stateFound.orElseThrow(() -> new Exception("El estado no ha sido encontrado en la base de datos"));
    }

    @Override
    public List<State> findAll() {
        return stateRepository.findAll();
    }

    @Override
    public State save(State state) {
        return stateRepository.save(state);
    }

    @Override
    public State update(Long id, State state) throws Exception {
        State stateFound = getById(id);
        stateFound.setName(state.getName());
        return stateRepository.save(stateFound);
    }

    @Override
    public void delete(Long id) {

    }
}
