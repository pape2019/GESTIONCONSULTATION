package org.sid.dao;

import org.sid.entities.Femme;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface FemmeRepository extends JpaRepository<Femme,Integer>{
    @Query("select f from Femme f where f.nom like :x")
	public Page<Femme> ChercherParNom(@Param("x")String mc,Pageable pageable);


	

	

}
