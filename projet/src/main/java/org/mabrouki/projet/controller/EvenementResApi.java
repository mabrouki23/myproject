package org.mabrouki.projet.controller;

import java.util.List;

import org.mabrouki.projet.model.Evenement;
import org.mabrouki.projet.service.EvenementServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping(path = "/api")
public class EvenementResApi {
	private EvenementServiceImpl evenementServiceImpl;

	public EvenementResApi(EvenementServiceImpl evenementServiceImpl) {
		this.evenementServiceImpl = evenementServiceImpl;
	}
	@CrossOrigin(origins = "*")
	@GetMapping("/evenements")
	public List<Evenement> allEvenements() {
		return evenementServiceImpl.listeEvenements();
	}
	@CrossOrigin(origins = "*")
	@PostMapping("/evenements")
	public Evenement save(@RequestBody Evenement evenement) {
		return evenementServiceImpl.save(evenement);
		
	}

}
