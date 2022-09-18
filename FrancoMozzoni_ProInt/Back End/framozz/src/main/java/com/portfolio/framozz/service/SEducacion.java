
package com.portfolio.framozz.service;

import com.portfolio.framozz.Security.Entity.Educacion;
import com.portfolio.framozz.Security.Repository.REducacion;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEducacion {
    @Autowired
    REducacion rEducacion;
    
    public List<Educacion> list(){
        return rEducacion.findAll();
    } 
    
    public Optional<Educacion> getOne(int id){
        return rEducacion.findById(id);
    }
    
    public Optional<Educacion> getByNombreEd(String nombreEd){
        return rEducacion.findBynombreEd(nombreEd);
    }
    
    public Optional<Educacion> getByDescripcionEd(String descripcionEd){
        return rEducacion.findBydescripcionEd(descripcionEd);
    }
    
    public void save(Educacion educacion){
        rEducacion.save(educacion);
    }
    
    public void delete(int id){
        rEducacion.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rEducacion.existsById(id);
    }
    
    public boolean existsByNombreEd(String nombreEd){
        return rEducacion.existsBynombreEd(nombreEd);
    }
    
    public boolean existsByDescripcionEd(String descripcionEd){
        return rEducacion.existsBydescripcionEd(descripcionEd);
    }
}
