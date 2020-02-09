package Presentation;

public class Medecins {
	private int id;
	private String titre;
	private String nom;
	private String prenom;
	private int version;
	
	public Medecins() {
	}

	public Medecins(int version,String titre,String nom, String prenom) 
	{
		this.titre=new String(titre);
		this.nom=new String(nom);
		this.prenom =new String(prenom);
		this.version=version;
	}
	public Medecins(int id,int version,String titre,String nom,String prenom) 
	{
		this.id=id;
		this.titre=new String(titre);
		this.nom=new String(nom);
		this.prenom =new String(prenom);
		this.version=version;
	}
	
	public Medecins(Medecins medecin)
	{
		setId(medecin.getId());
		setTitre(medecin.getTitre());
		setNom(medecin.getNom());
		setPrenom(medecin.getPrenom());
		setVersion(medecin.getVersion());
	}
	
	public int getId() { return this.id;}
	public void setId(int id) { this.id=id;}
	
	public String getTitre() { return this.titre;}
	public void setTitre(String titre) { this.titre=titre;}
	
	public String getNom() { return this.nom;}
	public void setNom(String nom) { this.nom=nom;}
	
	public String getPrenom() { return this.prenom;}
	public void setPrenom(String prenom) { this.prenom=prenom;}
	
	public int getVersion() { return this.version;}
	public void setVersion(int version) { this.version=version;}

	
	public String toString() 
	{
		String str="\n-Id Medecin : "+id+"\n-Titre : "+titre+"\n-Prenom : "+"\n-Nom : "+nom+"\n-Prenom : "+prenom+"\n-Version : "+version;
		return str;
	}
}
