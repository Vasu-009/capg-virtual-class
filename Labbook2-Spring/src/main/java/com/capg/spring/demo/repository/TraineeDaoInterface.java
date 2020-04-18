package com.capg.spring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.spring.demo.models.Trainee;

public interface TraineeDaoInterface extends JpaRepository<Trainee,Integer> {

}
