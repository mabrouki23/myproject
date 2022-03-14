package org.mabrouki.projet.service;

import java.util.List;

import org.mabrouki.projet.model.Evenement;



public interface EvenementServiceInterface {
	Evenement save(Evenement evenement );
	List <Evenement> listeEvenements();
}
