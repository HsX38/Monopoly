package Jeu;


import Jeu.Joueur;

public abstract class CarreauPropriete extends Carreau {

	private Joueur proprietaire;
        private int prix;
        private int loyer;

    public CarreauPropriete(Monopoly mono, int numero, String nomCarreau,Joueur p,int prix, int loyer) {
        super(mono, numero, nomCarreau);
        this.setProprietaire(p);
        this.setLoyer(loyer);
        this.setPrix(prix);
        
    }
    
// SET
    private void setProprietaire(Joueur prop){
        this.proprietaire=prop;
    }
    private void setPrix(int p){
        this.prix=p;
    }
    private void setLoyer(int loy){
        this.loyer=loy;
    }
    
    
// GET
    public Joueur getProprietaire(){
        return this.proprietaire;
    }
    public int getLoyer(){
        return this.loyer;
    }
    public int prix(){
        return this.prix;
    }
}
