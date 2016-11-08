package it.alfasoft.fabrizio.controller;

import it.alfasoft.fabrizio.model.Lista;
import it.alfasoft.fabrizio.model.Rubrica;
import it.alfasoft.fabrizio.service.Gestione;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ElencoVoci {
	
	Gestione g  = new Gestione();
	
	@RequestMapping(value="/elencoVoci.html",method=RequestMethod.GET)
	public ModelAndView listVoci(@ModelAttribute("voci") Lista voci, BindingResult bind){
		
		if(bind.hasErrors()){			
			ModelAndView model = new ModelAndView("index");
  			return  model;			
			}
			Rubrica r = g.cercaRubrica(1);
			voci.setLista(g.getAll(r));
			ModelAndView model = new ModelAndView("listaVoci");
			return  model;
	}
}
