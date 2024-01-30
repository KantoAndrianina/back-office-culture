package com.example.myapp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.myapp.Models.*;
import com.example.myapp.Services.Photo_TerrainService;

@RestController
@RequestMapping("/photo")
public class Photo_TerrainController {
    @Autowired
    private Photo_TerrainService photo_TerrainService;

    @GetMapping
    public List<Photo_Terrain> getAllPhoto_Terrains() {
        return photo_TerrainService.getAllPhoto();
    }

}
