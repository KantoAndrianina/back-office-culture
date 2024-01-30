package com.example.myapp.Services;

import com.example.myapp.Models.Terrain;
import com.example.myapp.Repository.TerrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TerrainService {

    private final TerrainRepository terrainRepository;

    @Autowired
    public TerrainService(TerrainRepository terrainRepository) {
        this.terrainRepository = terrainRepository;
    }

    public List<Terrain> getAllTerrains() {
        return terrainRepository.findAll();
    }

    public Optional<Terrain> getTerrainById(int id) {
        return terrainRepository.findById(id);
    }

    public Terrain createTerrain(Terrain terrain) {
        return terrainRepository.save(terrain);
    }

    public Terrain updateTerrain(int id, Terrain updatedTerrain) {
        if (terrainRepository.existsById(id)) {
            updatedTerrain.setId_Terrain(id);
            return terrainRepository.save(updatedTerrain);
        } else {
            // Handle the case where the terrain with the given id is not found
            return null;
        }
    }

    public void deleteTerrain(int id) {
        terrainRepository.deleteById(id);
    }

    public List<Terrain> findTerrainNonValide() {
        return terrainRepository.findByValidation(0);
    }

    public List<Terrain> findTerrainValide() {
        return terrainRepository.findByValidation(1);
    }

    public void validerTerrain(int idTerrain) {
        Optional<Terrain> optionalTerrain = terrainRepository.findById(idTerrain);

        if (optionalTerrain.isPresent()) {
            Terrain terrain = optionalTerrain.get();
            terrain.setValidation(1);
            terrainRepository.save(terrain);
        } else {
            // Handle the case where terrain with the given id is not found
            // You can throw an exception or handle it based on your application logic
        }
    }

    public void refuserTerrain(int id) {
        // Implementation to refuse/delete terrain
        // This might involve deleting the terrain from the repository
        terrainRepository.deleteById(id);
    }
}
