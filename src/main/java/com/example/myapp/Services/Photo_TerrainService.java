package com.example.myapp.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.example.myapp.Repository.*;
import com.example.myapp.Models.*;

@Service
public class Photo_TerrainService {
    
    @Autowired
    private Photo_TerrainRepository photo_TerrainRepository;

    public List<Photo_Terrain> getAllPhoto() {
        return photo_TerrainRepository.findAll();
    }

}
