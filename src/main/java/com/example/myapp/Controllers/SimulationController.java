package com.example.myapp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.myapp.Services.*;
import com.example.myapp.Models.*;

@RestController
@CrossOrigin(origins = "https://lively-lollipop-255c7d.netlify.app")
@RequestMapping("/simulations")
public class SimulationController {
    @Autowired
    private SimulationService SimulationService;

    @GetMapping
    public List<Simulation> getAllSimulations() {
        return SimulationService.getAllSimulations();
    }
    
}
