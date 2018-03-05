package fr.insalyon.dasi.proactif;


// TODO : imports


import javax.persistence.Entity;

@Entity
public class DemandeInterventionLivraison extends DemandeIntervention
{
	private String objet;
	private String entreptrise;
}
