package com.joaquinalvarez.reservaespaciosutn.controller;

import com.joaquinalvarez.reservaespaciosutn.model.entity.State;
import com.joaquinalvarez.reservaespaciosutn.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/state")
public class StateController {
    @Autowired
    private StateService stateService;
    @GetMapping("/get")
    public ResponseEntity<List<State>> getStates(){
        return new ResponseEntity<>(stateService.findAll(), HttpStatus.OK);
    }


}
