package org.sid.metier;

import java.util.List;

import org.sid.entities.Femme;

public interface FemmeMetier {
  public Femme SaveFemme(Femme f);
  public List<Femme> listeFemme();
  public Femme getFemmeByNum(int numMat);
  public void deleteFemme(int numMat);
}
