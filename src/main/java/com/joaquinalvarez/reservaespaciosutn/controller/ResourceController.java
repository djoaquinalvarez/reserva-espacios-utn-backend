package com.joaquinalvarez.reservaespaciosutn.controller;

import com.joaquinalvarez.reservaespaciosutn.model.entity.Resource;
import com.joaquinalvarez.reservaespaciosutn.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resource")
public class ResourceController {

    @Autowired
    private ResourceService resourceService;

    @GetMapping("/get")
    public ResponseEntity<List<Resource>> getResources(){
        return new ResponseEntity<>(resourceService.getResources(), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Resource> getResourceById(@PathVariable Long id) throws Exception {
        return new ResponseEntity<>(resourceService.getById(id), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Resource> createResource(@RequestBody Resource resource){
        return new ResponseEntity<>(resourceService.create(resource), HttpStatus.CREATED);
    }
}
