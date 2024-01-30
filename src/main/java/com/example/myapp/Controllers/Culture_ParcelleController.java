package com.example.myapp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.myapp.Services.*;
import com.example.myapp.Models.*;

@RestController
@CrossOrigin(origins = "https://lively-lollipop-255c7d.netlify.app")
@RequestMapping("/culture_parcelle")
public class Culture_ParcelleController {
    @Autowired
    private Culture_ParcelleService Culture_ParcelleService;

    @GetMapping
    public List<Culture_Parcelle> getAllCulture_Parcelles() {
        return Culture_ParcelleService.getAllCulture_Parcelles();
    }

}
