package com.example.myapp.Repository;

import com.example.myapp.Models.Terrain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TerrainRepository extends JpaRepository<Terrain, Integer> {

    List<Terrain> findByValidation(int validation);

}
