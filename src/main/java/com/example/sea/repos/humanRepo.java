package com.example.sea.repos;

import com.example.sea.entitiy.human;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface humanRepo extends JpaRepository<human, Integer> {}
