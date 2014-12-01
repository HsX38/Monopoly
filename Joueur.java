package Jeu;

import java.util.*;

public class Joueur {

    private Monopoly monopoly;
    private HashMap<Integer,Compagnie> compagnies ;
    private HashMap<Integer,Gare> gares;
    private Carreau positionCourante;
    private HashMap<Integer,ProprieteAConstruire> proprietesAConstruire;
    private String nomJoueur;
    private int cash = 1500;
    
    public Joueur(Monopoly mono,Carreau car, String nom){
        gares= new HashMap();
        compagnies = new HashMap();
        proprietesAConstruire= new HashMap();
        this.setPositionCourante(car);
        this.setMonopoly(mono);
        this.setNomJoueur(nom);
    }
        
// SET
    private void setMonopoly(Monopoly mono){
        this.monopoly=mono;
    }
    
    private void setPositionCourante(Carreau car){
        this.positionCourante=car;
    }
    
    private void setNomJoueur(String nom){
        this.nomJoueur=nom;
    }
    
    private void setCash(int cash){
        this.cash=cash;
    }
    private void setCompagnies(HashMap<Integer,Compagnie> comp){
        this.compagnies=comp;
    }
    private void setGares(HashMap<Integer,Gare> gares){
        this.gares=gares;
    }
    private void setProprieteAConstruire(HashMap<Integer,ProprieteAConstruire> proprietes){
        this.proprietesAConstruire=proprietes;
    }
    
    
// GET
    public Monopoly getMonopoly(){
        return this.monopoly;
    }
    
    public Carreau getPositionCourante(){
        return this.positionCourante;
    }
    private HashMap<Integer,Compagnie> getCompagnies(){
        return this.compagnies;
    }
    
    private HashMap<Integer,Gare> getGares(){
        return this.gares;
    }
    
    private HashMap<Integer,ProprieteAConstruire> getProprieteAConstruires(){
        return this.proprietesAConstruire;
    }
    
    
// OTHERS
    public Compagnie getCompagnie(int numero){
        // Retourne la compagnie de numero, numero si elle appartient au joueur, sinon return null.
        if (this.getCompagnies().containsKey(numero)){
            return this.getCompagnies().get(numero);
        }
        else return null;
    }
    public Gare getGare(int numero){
        // Retourne la gare de numero, numero si elle appartient au joueur, sinon return null.
        if (this.getCompagnies().containsKey(numero)){
            return this.getGares().get(numero);
        }
        else return null;
    }
    public ProprieteAConstruire getProprieteAConstruire(int numero){
        // Retourne la ProprieteAConstruire de numero, numero si elle appartient au joueur, sinon return null.
        if (this.getCompagnies().containsKey(numero)){
            return this.getProprieteAConstruires().get(numero);
        }
        else return null;
    }
    public void Payer(int montant){
        this.cash=this.cash-montant;
    }
    public int getNbGares(){
        return this.getGares().size();
    }
    public int getNbCompagnie(){
        return this.getCompagnies().size();
    }
    
ceci est un test
}
