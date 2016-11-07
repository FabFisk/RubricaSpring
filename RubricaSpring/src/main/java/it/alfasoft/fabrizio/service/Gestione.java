package it.alfasoft.fabrizio.service;

import it.alfasoft.fabrizio.dao.RubricaDAO;
import it.alfasoft.fabrizio.model.Rubrica;
import it.alfasoft.fabrizio.model.Voce;

public class Gestione {
	
	RubricaDAO rDAO = new RubricaDAO();
	VoceDAO vDAO = new VoceDAO();

	public void createRubrica(Rubrica r) {
		rDAO.creaRubrica(r);		
	}

	public void createVoce(Rubrica r, Voce v) {
		vDAO.creaVoce(v);
		r.addVoce(v);
		rDAO.aggiornaRubrica(r);
		
	}


	
	

}
