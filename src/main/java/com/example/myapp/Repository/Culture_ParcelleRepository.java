package com.example.myapp.Repository;

import com.example.myapp.Models.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import com.example.myapp.Models.*;

@Repository
public interface Culture_ParcelleRepository extends JpaRepository<Culture_Parcelle, Integer> {
    
}
