package it.alfasoft.fabrizio.controller;

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

	
	@RequestMapping(value="/formVoce.html",method=RequestMethod.GET)
	public ModelAndView chidereForm(){
		System.out.println("ciao");
		ModelAndView model=new ModelAndView("formVoce");
		
		return  model;
	}
	
	@RequestMapping(value="/aggiungiVoce",method=RequestMethod.POST)
	public ModelAndView addVoce(@ModelAttribute("v") Voce voce, BindingResult bind){
		
		if(bind.hasErrors()){			
			ModelAndView model=new ModelAndView("formVoce");
  			return  model;			
			}
//			Gestione g = new Gestione();
//			g.createVoce(r, v);
			ModelAndView model=new ModelAndView("formVoce");
			return  model;
	}
	
	
	
}
