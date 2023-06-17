package com.driver.repository;

import com.driver.model.Spot;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


//@Repository
public interface SpotRepository extends JpaRepository<Spot,Integer>{
//    Optional<Spot> findById(Integer id);
}
