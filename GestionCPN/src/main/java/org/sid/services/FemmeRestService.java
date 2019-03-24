package org.sid.services;

import java.util.List;

import org.sid.dao.FemmeRepository;
import org.sid.entities.Femme;
import org.sid.metier.FemmeMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class FemmeRestService {
	@Autowired
	private FemmeRepository femmeRep;
 private FemmeMetier femmeMetier;
	 
     @RequestMapping(value="/femmes",method=RequestMethod.POST)
	public Femme SaveFemme(@RequestBody Femme f) {
		return femmeMetier.SaveFemme(f);
	}
     @RequestMapping(value="/femmes",method=RequestMethod.GET)
	public List<Femme> listeFemme() {
		return femmeMetier.listeFemme();
	}
    
     @RequestMapping(value="/femme/{numMat}",method=RequestMethod.GET)
	public Femme getFemmeByNum(@PathVariable int numMat) {
		return femmeMetier.getFemmeByNum(numMat);
	}
     
     @RequestMapping(value="/chercherFemme",method=RequestMethod.GET)
	public Page<Femme> chercher(
			@RequestParam(name="mc",defaultValue="")String mc,
			@RequestParam(name="page",defaultValue="0")int page,
			@RequestParam(name="size",defaultValue="5")int size) {
		return femmeRep.ChercherParNom("%"+mc+"%",new PageRequest(page, size));
	}
     @RequestMapping(value="/femme/{numMat}",method=RequestMethod.DELETE)
	public void deleteFemme(int numMat) {
		femmeMetier.deleteFemme(numMat);
	}
     @RequestMapping(value="/femme/{numMat}",method=RequestMethod.PUT)
 	public Femme UpdateFemme(@PathVariable int numMat,@RequestBody Femme f) {
    	 f.setNumMat(numMat);
 		return femmeMetier.SaveFemme(f);
 	}
}
