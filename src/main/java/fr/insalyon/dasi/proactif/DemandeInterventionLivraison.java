package fr.insalyon.dasi.proactif;




import javax.persistence.Entity;

@Entity
public class DemandeInterventionLivraison extends DemandeIntervention
{
	private String objet;
	private String entreptrise;
}
