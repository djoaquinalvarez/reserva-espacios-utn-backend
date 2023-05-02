package com.joaquinalvarez.reservaespaciosutn.service.impl;

import com.joaquinalvarez.reservaespaciosutn.model.entity.Resource;
import com.joaquinalvarez.reservaespaciosutn.repository.ResourceRepository;
import com.joaquinalvarez.reservaespaciosutn.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    private ResourceRepository resourceRepository;

    @Override
    public Resource getById(Long id) throws Exception {
        return resourceRepository.findById(id).orElseThrow(() -> new Exception(
                String.format("El recurso con el id #%s no ha sido encontrado en la base de datos", id)
        ));
    }

    @Override
    public List<Resource> getResources() {
        return resourceRepository.findAll();
    }

    @Override
    public Resource create(Resource resource) {
        return resourceRepository.save(resource);
    }

    @Override
    public Resource update(Long id, Resource resource) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
