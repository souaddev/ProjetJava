package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import BaseDeDonnee.Connect;
import Presentation.Client;


import BaseDeDonnee.Connect;
import Presentation.Client;
import Presentation.Medecins;

public class MedecinDAOImp implements MedecinsDAO{
	Connection con;
	public MedecinDAOImp() {
		// TODO Auto-generated constructor stub
	}
		@Override
		public List<Medecins> getAllMedecin(){
			Medecins client=null;
			List<Medecins> lc=new ArrayList<>();
			con=Connect.getConnect();
	        String req="Select * From Clients";
	        try {
	            PreparedStatement ps= (PreparedStatement) con.prepareStatement(req);
	            ResultSet res=ps.executeQuery();
	            while(res.next()) {
	            	Medecins c=new Medecins(res.getInt("id"),res.getInt("version"),res.getString("titre"),res.getString("nom"),res.getString("prenom"));
	            	lc.add(c);
	            }
	        } catch (SQLException e) {
	        	e.printStackTrace();
	        }
			return lc;
		}
		@Override
		public Medecins getMedecin(int id) {
			Medecins medecin=null;
			con=Connect.getConnect();
	        String req="Select Version, Titre, Nom,Prenom From Clients WHERE Id=?";
	        try {
	           PreparedStatement ps= con.prepareStatement(req);
	            ps.setInt(1,id);
	            ResultSet res=ps.executeQuery();
	            if(res.next()) {
	            	medecin=new Medecins(id,res.getInt("version"),res.getString("titre"),res.getString("nom"),res.getString("prenom"));
	            }
	        } catch (SQLException e) {
	        	e.printStackTrace();
	        }
			return medecin;
		}
		@Override
		public void addMedecin(Medecins medecin) {
			
		}
		@Override
		public void updateMedecin(Medecins medecin) {
			
		}
		@Override
		public void deleteMedecin(Medecins medecin) {
			
		}
}
