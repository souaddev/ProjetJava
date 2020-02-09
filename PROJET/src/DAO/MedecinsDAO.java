package DAO;

import java.util.List;

import Presentation.Medecins;

public interface MedecinsDAO {
		public List<Medecins> getAllMedecin();
		public Medecins getMedecin(int id);
		public void addMedecin(Medecins client);
		public void updateMedecin(Medecins client);
		public void deleteMedecin(Medecins client);

}
