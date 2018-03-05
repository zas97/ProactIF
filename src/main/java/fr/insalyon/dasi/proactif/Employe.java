package fr.insalyon.dasi.proactif;


// TODO : imports


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employe
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEmploye;
	
	private String numeroTelephone;
	
	// L'agenda d'un employé est simplifié à une heure de début de service et une heure de fin de service
	// On considère que l'employé travaille toute la semaine (7/7)	
	private Integer heureDebut;
	private Integer heureFin;
}


