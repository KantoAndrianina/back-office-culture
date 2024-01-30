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
public class Photo_Terrain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Photo_Terrain")
    private int id_Photo_Terrain;

    @Column(name = "Id_Terrain")
    private int Id_Terrain;
    @Column(name = "img")
    private String img;

    public int getId_Photo_Terrain() {
        return id_Photo_Terrain;
    }

    public void setId_Photo_Terrain(int id_Photo_Terrain) {
        this.id_Photo_Terrain = id_Photo_Terrain;
    }

    public int getId_Terrain() {
        return Id_Terrain;
    }

    public void setId_Terrain(int id_Terrain) {
        Id_Terrain = id_Terrain;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

}
