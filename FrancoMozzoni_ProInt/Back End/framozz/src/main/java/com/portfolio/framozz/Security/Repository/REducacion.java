
package com.portfolio.framozz.Security.Repository;

import com.portfolio.framozz.Security.Entity.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REducacion extends JpaRepository<Educacion, Integer> {
    public Optional<Educacion> findBynombreEd(String nombreEd);
    public boolean existsBynombreEd(String nombreEd);

    public Optional<Educacion> findBydescripcionEd(String descripcionEd);

    public boolean existsBydescripcionEd(String descripcionEd);
    
}
