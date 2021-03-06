package it.alfasoft.fabrizio.controller;

import it.alfasoft.fabrizio.model.Rubrica;
import it.alfasoft.fabrizio.model.Voce;
import it.alfasoft.fabrizio.service.Gestione;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NewVoce {
	
	Gestione g  = new Gestione();
	
	@RequestMapping(value="/formVoce.html",method=RequestMethod.GET)
	public ModelAndView chidereForm(){
		//System.out.println("ciao");
		ModelAndView model=new ModelAndView("formVoce");
		
		return  model;
	}
	
	@RequestMapping(value="/aggiungiVoce",method=RequestMethod.POST)
	public ModelAndView addVoce(@ModelAttribute("v") Voce voce, BindingResult bind){
		
		if(bind.hasErrors()){			
			ModelAndView model=new ModelAndView("formVoce");
  			return  model;			
			}
			Rubrica r = g.cercaRubrica(1);
			g.createVoce(r, voce);
			ModelAndView model=new ModelAndView("formVoce");
			return  model;
	}
}
