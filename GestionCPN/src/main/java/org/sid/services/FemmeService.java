package org.sid.services;

import java.util.List;
import org.sid.entities.Femme;

public interface FemmeService {
	 public Femme SaveFemme(Femme f);
	  public List<Femme> listeFemme();
	  public Femme getFemmeByNum(int numMat);
	  public void update(Femme femme);
	  public void deleteFemme(int numMat);
}
