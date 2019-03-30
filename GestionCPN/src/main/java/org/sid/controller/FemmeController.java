package org.sid.controller;

import java.util.List;

import org.sid.entities.Femme;
import org.sid.services.FemmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/enregistrement")
public class FemmeController {

 @Autowired
 FemmeService femmeservice;
 
  @GetMapping()
	public List<Femme> listeFemme() {
		return femmeservice.listeFemme();
	}
 
 
}
