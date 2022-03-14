package org.mabrouki.projet.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.transaction.Transactional;


import org.mabrouki.projet.model.Evenement;
import org.mabrouki.projet.repository.EvenementRepository;
import org.mabrouki.projet.tdo.EvenementRequestDto;
import org.mabrouki.projet.tdo.EvenementResponseDto;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service

@Transactional
public class EvenementServiceImpl implements EvenementServiceInterface{
private EvenementRepository evenementRepository;

	public EvenementServiceImpl(EvenementRepository evenementRepository) {
	
	this.evenementRepository = evenementRepository;
	
}

	@Override
	public Evenement save(Evenement evenement) {
		// TODO Auto-generated method stub
		
		return evenementRepository.save(evenement);
	}

	@Override
	public List<Evenement> listeEvenements() {
		// TODO Auto-generated method stub
		return evenementRepository.findAll();
	}


}
