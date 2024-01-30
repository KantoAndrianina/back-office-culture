package com.example.myapp.Services;

import com.example.myapp.Models.Parcelle;
import com.example.myapp.Repository.ParcelleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParcelleService {

    private final ParcelleRepository parcelleRepository;

    @Autowired
    public ParcelleService(ParcelleRepository parcelleRepository) {
        this.parcelleRepository = parcelleRepository;
    }

    public List<Parcelle> getAllParcelles() {
        return parcelleRepository.findAll();
    }

    public Optional<Parcelle> getParcelleById(Integer id) {
        return parcelleRepository.findById(id);
    }

    public Parcelle saveParcelle(Parcelle parcelle) {
        return parcelleRepository.save(parcelle);
    }

    public void deleteParcelleById(Integer id) {
        parcelleRepository.deleteById(id);
    }

    // Add more methods as needed for your use case

}
