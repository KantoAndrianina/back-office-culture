package com.example.myapp.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Timestamp;

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
public class Simulation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Simulation")
    private int id_Simulation;

    @Column(name = "id_Culture_Parcelle")
    private int id_Culture_Parcelle;
    @Column(name = "date")
    private Timestamp date;

    public int getId_Simulation() {
        return id_Simulation;
    }

    public void setId_Simulation(int id_Simulation) {
        this.id_Simulation = id_Simulation;
    }

    public int getId_Culture_Parcelle() {
        return id_Culture_Parcelle;
    }

    public void setId_Culture_Parcelle(int id_Culture_Parcelle) {
        this.id_Culture_Parcelle = id_Culture_Parcelle;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

}
