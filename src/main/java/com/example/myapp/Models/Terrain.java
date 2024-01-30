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
public class Terrain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Terrain")
    private int id_Terrain;

    @Column(name = "description")
    private String description;
    @Column(name = "localisation")
    private String localisation;
    @Column(name = "Nb_Parcelle")
    private int Nb_Parcelle;
    @Column(name = "id_Utilisateur")
    private int id_Utilisateur;
    @Column(name = "validation")
    private int validation;

    public int getId_Terrain() {
        return id_Terrain;
    }

    public void setId_Terrain(int id_Terrain) {
        this.id_Terrain = id_Terrain;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public int getNb_Parcelle() {
        return Nb_Parcelle;
    }

    public void setNb_Parcelle(int nb_Parcelle) {
        Nb_Parcelle = nb_Parcelle;
    }

    public int getId_Utilisateur() {
        return id_Utilisateur;
    }

    public void setId_Utilisateur(int id_Utilisateur) {
        this.id_Utilisateur = id_Utilisateur;
    }

    public int getValidation() {
        return validation;
    }

    public void setValidation(int validation) {
        this.validation = validation;
    }

}
