package com.example.myapp.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.example.myapp.Repository.*;
import com.example.myapp.Models.*;

@Service
public class Culture_ParcelleService {
     
    @Autowired
    private Culture_ParcelleRepository Culture_ParcelleRepository;

    public List<Culture_Parcelle> getAllCulture_Parcelles() {
        return Culture_ParcelleRepository.findAll();
    }

}
