package fr.insalyon.dasi.proactif;


// TODO : imports



/*public Enum DemandeInterventionStatus
{
	NON_ASSIGNEE;
	EN_COURS_DE_TRAITEMENT;
	TERMINEE;
	INCIDENT;!
}*/

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public abstract class DemandeIntervention
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer idDemandeIntervention;
	
	protected Date date;
	protected Date dateFin;
	
	protected String commentaire;
	protected Integer heureFin;
	
	//protected DemandeInterventionStatus status;
}


