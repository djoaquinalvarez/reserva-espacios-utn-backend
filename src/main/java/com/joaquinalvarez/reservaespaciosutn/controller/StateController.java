package com.joaquinalvarez.reservaespaciosutn.controller;

import com.joaquinalvarez.reservaespaciosutn.model.entity.State;
import com.joaquinalvarez.reservaespaciosutn.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/add")
    public ResponseEntity<State> createState(@RequestBody State state){
        return new ResponseEntity<>(stateService.save(state),HttpStatus.CREATED);

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<State> updateState(@RequestBody State state,@PathVariable Long id) throws Exception {
        return new ResponseEntity<>(stateService.update(id, state), HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteState(@PathVariable Long id) throws Exception {
        stateService.delete(id);
    }


}
