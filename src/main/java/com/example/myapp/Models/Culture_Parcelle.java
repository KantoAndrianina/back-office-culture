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
public class Culture_Parcelle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Culture_Parcelle")
    private int id_Culture_Parcelle;

    @Column(name = "id_Parcelle")
    private int id_Parcelle;
    @Column(name = "id_culture")
    private int id_culture;

    public int getId_Culture_Parcelle() {
        return id_Culture_Parcelle;
    }

    public int getId_Parcelle() {
        return id_Parcelle;
    }

    public int getId_culture() {
        return id_culture;
    }

    public void setId_Culture_Parcelle(int id_Culture_Parcelle) {
        this.id_Culture_Parcelle = id_Culture_Parcelle;
    }

    public void setId_Parcelle(int id_Parcelle) {
        this.id_Parcelle = id_Parcelle;
    }

    public void setId_culture(int id_culture) {
        this.id_culture = id_culture;
    }

}
