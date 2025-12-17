//repository->StudentRepository.java

package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.StuEnt;

public interface StudentRepository extends JpaRepository<StuEnt, Long> {
    
    
}