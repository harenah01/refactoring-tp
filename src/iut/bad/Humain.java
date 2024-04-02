package iut.bad;

import java.util.ArrayList;
import java.util.List;

public class Humain implements Consommation{
    
    private String nom;
    private String prenom;
    private int age;
    private List<Humain> amis;

    public Humain() {
    	this.amis = new ArrayList<>();
    }
    
    public Humain(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}


    public String toString() {
        return "Nom: " + nom + "\nPrénom: " + prenom + "\nÂge: " + age;
    }
	public void boire() {
		
	}
	public void manger() {
		
	}
	public void ami(Humain autreHumain, int dureeAmitie) {
        this.amis.add(autreHumain);
        autreHumain.amis.add(this);
        System.out.println(this.prenom + " est maintenant ami avec " + autreHumain.prenom + " pour " + dureeAmitie + " jours.");
    }

   
    public void ami(Humain autreHumain) {
        ami(autreHumain, 100); 
    }
	
}