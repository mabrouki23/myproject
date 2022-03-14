package org.mabrouki.projet.repository;

import org.mabrouki.projet.model.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;


public interface EvenementRepository extends JpaRepository<Evenement, Integer> {

}
