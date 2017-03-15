package de.chiliconunity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import de.chiliconunity.model.Rezept;


@RestController
public class RezeptController {

	
    @GetMapping("/chili")
    public Rezept asdf() {
    	System.out.println("GET auf /chili");
		Rezept rezept = new Rezept();
		System.out.println(rezept.getName()+" "+ rezept.getAnzahlPersonen()+" "+ rezept.getErsteller());
		return rezept;
    }
    
}