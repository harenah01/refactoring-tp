package iut.bad;

public class Femme extends Humain {
    
    public Femme() {
        super(); 
    }

    // Constructeur avec paramètres
    public Femme(String nom, String prenom, int age) {
        super(nom, prenom, age); 
    }
    
    
    @Override
    public String toString() {
        return "C'est une femme\n" + super.toString();
    }
    
    public static void main(String[] args) {
        Homme homme = new Homme("Doe", "John", 30);
        Femme femme = new Femme("Doe", "Jane", 28);

        homme.ami(femme);
    }
}
