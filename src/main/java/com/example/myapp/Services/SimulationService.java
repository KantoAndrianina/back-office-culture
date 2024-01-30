package com.example.myapp.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.example.myapp.Repository.*;
import com.example.myapp.Models.*;

@Service
public class SimulationService {
        
    @Autowired
    private SimulationRepository SimulationRepository;

    public List<Simulation> getAllSimulations() {
        return SimulationRepository.findAll();
    }

}
