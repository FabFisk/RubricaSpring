package it.alfasoft.fabrizio.service;

import java.util.List;

import it.alfasoft.fabrizio.dao.RubricaDAO;
import it.alfasoft.fabrizio.dao.VoceDAO;
import it.alfasoft.fabrizio.model.Rubrica;
import it.alfasoft.fabrizio.model.Voce;

public class Gestione {
	
	RubricaDAO rDAO = new RubricaDAO();
	VoceDAO vDAO = new VoceDAO();

	public void createRubrica(Rubrica r) {
		rDAO.creaRubrica(r);		
	}

	public void createVoce(Rubrica r, Voce v) {
		v.setRubrica(r);
		vDAO.creaVoce(v);
		r.addVoce(v);
		rDAO.aggiornaRubrica(r);
		
	}
	public Rubrica cercaRubrica(long id){
		return rDAO.readRubrica(id);
	}

	public List<Voce> getAll(Rubrica r) {
		return vDAO.getAll(r);
	}


	
	

}
