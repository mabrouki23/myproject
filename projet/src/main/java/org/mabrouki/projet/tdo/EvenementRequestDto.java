package org.mabrouki.projet.tdo;

import java.util.Date;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EvenementRequestDto {
	@Id
	  private Integer idEvenement; 
	  
	    private String nom;
	     
	    private String description;
	     
	    private Date dateDebut;
	      
	    private Date dateFin;
}
