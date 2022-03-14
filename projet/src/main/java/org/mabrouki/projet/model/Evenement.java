package org.mabrouki.projet.model;

import java.io.Serializable;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Table(name = "evenement")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Evenement implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "idEvenement")
    private Integer idEvenement;    
    @Column(name = "nom")
    private String nom;    
    @Column(name = "description")
    private String description;    
    @Column(name = "dateDebut")   
    private LocalDate dateDebut;
    @Basic(optional = false)
    @Column(name = "dateFin")    
    private LocalDate dateFin;
	public Evenement(String nom, String description, LocalDate dateDebut, LocalDate dateFin) {
		
		this.nom = nom;
		this.description = description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
    

}
