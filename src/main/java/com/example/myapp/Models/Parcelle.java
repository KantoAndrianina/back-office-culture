package com.example.myapp.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

/*TY LE ANDRI NO METY FA NENAH JAVA 17*/
// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.Column;
/* DE JEREO ANATY application.propreties fa misy zavatra napiko manova azy ho lasa postgres
 */
@Entity
public class Parcelle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Parcelle")
    private int id_Parcelle;

    @Column(name = "id_Terrain")
    private int id_Terrain;
    @Column(name = "rendement")
    private double rendement;
    @Column(name = "largeur")
    private double largeur;
    @Column(name = "longueur")
    private double longueur;

    public int getId_Parcelle() {
        return id_Parcelle;
    }

    public void setId_Parcelle(int id_Parcelle) {
        this.id_Parcelle = id_Parcelle;
    }

    public int getId_Terrain() {
        return id_Terrain;
    }

    public void setId_Terrain(int id_Terrain) {
        this.id_Terrain = id_Terrain;
    }

    public double getRendement() {
        return rendement;
    }

    public void setRendement(double rendement) {
        this.rendement = rendement;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

}
