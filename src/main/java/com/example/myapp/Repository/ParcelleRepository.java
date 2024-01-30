package com.example.myapp.Repository;

import com.example.myapp.Models.Parcelle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParcelleRepository extends JpaRepository<Parcelle, Integer> {

}
