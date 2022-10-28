package it.giuseppe.Calc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class CalcController {


	
	@RequestMapping("/calc")
	public String welcome(@ModelAttribute Somma somma) {
	   
		
	
		
		   
	
	   
	
		return "CalcSpring"; 
		     
	   }

	@RequestMapping(value ="/calcolo", method=RequestMethod.POST)
		public String calcolo (@ModelAttribute Somma somma, Model model) {
		
		model.addAttribute("model", somma);
		
		return "somma";
		
		
	}
	
	
	
}
