package com.example.myapp.Controllers;

import com.example.myapp.Models.Parcelle;
import com.example.myapp.Services.ParcelleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/parcelles")
public class ParcelleController {

    private final ParcelleService parcelleService;

    @Autowired
    public ParcelleController(ParcelleService parcelleService) {
        this.parcelleService = parcelleService;
    }

    @GetMapping
    public ResponseEntity<List<Parcelle>> getAllParcelles() {
        List<Parcelle> parcelles = parcelleService.getAllParcelles();
        return new ResponseEntity<>(parcelles, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Parcelle> getParcelleById(@PathVariable Integer id) {
        Optional<Parcelle> optionalParcelle = parcelleService.getParcelleById(id);
        return optionalParcelle.map(parcelle -> new ResponseEntity<>(parcelle, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Parcelle> saveParcelle(@RequestBody Parcelle parcelle) {
        Parcelle savedParcelle = parcelleService.saveParcelle(parcelle);
        return new ResponseEntity<>(savedParcelle, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteParcelleById(@PathVariable Integer id) {
        parcelleService.deleteParcelleById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Add more methods as needed for your use case

}
