package iut.bad;

public class Homme extends Humain {
   
    public Homme() {
        super(); 
    }

  
    public Homme(String nom, String prenom, int age) {
        super(nom, prenom, age); 
    }
    
    
    @Override
    public String toString() {
        return "C'est un homme\n" + super.toString(); 
    }
}
