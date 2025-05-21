package br.eti.gaby.airports.repositories;

import br.eti.gaby.airports.entities.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ppjatb
 */
@Repository
public interface AirportRepository extends JpaRepository<Airport, Long> {
    
}
