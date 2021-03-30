package com.jsfspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsfspring.beans.Developer;

@Repository
public interface DeveloperRepository extends JpaRepository<Developer, Integer> {
}
