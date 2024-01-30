package com.example.myapp.Repository;

import com.example.myapp.Models.Photo_Terrain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Photo_TerrainRepository extends JpaRepository<Photo_Terrain, Integer> {
    
}
