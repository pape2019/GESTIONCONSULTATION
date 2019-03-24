package org.sid.ImpleMetier;

import java.util.List;

import org.sid.dao.FemmeRepository;
import org.sid.entities.Femme;
import org.sid.metier.FemmeMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class FemmeMetierImpl implements FemmeMetier {
	@Autowired
   private FemmeRepository femmeRep;
	@Override
	public Femme SaveFemme(Femme f) {
		// TODO Auto-generated method stub
		return femmeRep.save(f);
	}

	@Override
	public List<Femme> listeFemme() {
		// TODO Auto-generated method stub
		return femmeRep.findAll();
	}

	@Override
	public Femme getFemmeByNum(int numMat) {
		// TODO Auto-generated method stub
		return femmeRep.findOne(numMat);
	}

//	@Override
	//public Femme getFemmeByNom(String nom) {
		// TODO Auto-generated method stub
		//return femmeRep.findOne(nom);
	//}

	@Override
	public void deleteFemme(int numMat) {
		// TODO Auto-generated method stub
		femmeRep.delete(numMat);
	}
    
}
