package com.example.myapp.Controllers;

import com.example.myapp.Models.Terrain;
import com.example.myapp.Services.TerrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "https://lively-lollipop-255c7d.netlify.app") // Replace with your React app's URL
@RequestMapping("/terrains")
public class TerrainController {

    private final TerrainService terrainService;

    @Autowired
    public TerrainController(TerrainService terrainService) {
        this.terrainService = terrainService;
    }

    @GetMapping
    public ResponseEntity<List<Terrain>> getAllTerrains() {
        List<Terrain> terrains = terrainService.getAllTerrains();
        return new ResponseEntity<>(terrains, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Terrain> getTerrainById(@PathVariable int id) {
        Optional<Terrain> terrain = terrainService.getTerrainById(id);
        return terrain.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Terrain> createTerrain(@RequestBody Terrain terrain) {
        Terrain createdTerrain = terrainService.createTerrain(terrain);
        return new ResponseEntity<>(createdTerrain, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Terrain> updateTerrain(@PathVariable int id, @RequestBody Terrain updatedTerrain) {
        Terrain terrain = terrainService.updateTerrain(id, updatedTerrain);
        return terrain != null
                ? new ResponseEntity<>(terrain, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTerrain(@PathVariable int id) {
        terrainService.deleteTerrain(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/nonValide")
    public ResponseEntity<List<Terrain>> getNonValideTerrains() {
        List<Terrain> nonValideTerrains = terrainService.findTerrainNonValide();
        return new ResponseEntity<>(nonValideTerrains, HttpStatus.OK);
    }

    @GetMapping("/valide")
    public ResponseEntity<List<Terrain>> getValideTerrains() {
        List<Terrain> valideTerrains = terrainService.findTerrainValide();
        return new ResponseEntity<>(valideTerrains, HttpStatus.OK);
    }

    @PostMapping("/valider/{id}")
    public ResponseEntity<Void> validerTerrain(@PathVariable int id) {
        terrainService.validerTerrain(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}/refuser")
    public ResponseEntity<Void> refuserTerrain(@PathVariable int id) {
        terrainService.refuserTerrain(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
