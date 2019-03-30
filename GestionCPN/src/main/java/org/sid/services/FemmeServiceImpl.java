package org.sid.services;

import java.util.List;

import org.sid.dao.FemmeRepository;
import org.sid.entities.Femme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FemmeServiceImpl implements FemmeService {
   @Autowired
	private FemmeRepository femmeRepository;
	@Override
	public Femme SaveFemme(Femme f) {
		return femmeRepository.save(f);
	}

	@Override
	public List<Femme> listeFemme() {
		return femmeRepository.findAll();
	}

	@Override
	public Femme getFemmeByNum(int numMat) {
		return femmeRepository.findOne(numMat);
	}

	@Override
	public void update(Femme femme) {
	
	}

	@Override
	public void deleteFemme(int numMat) {
		femmeRepository.delete(numMat);
	}
	

}
