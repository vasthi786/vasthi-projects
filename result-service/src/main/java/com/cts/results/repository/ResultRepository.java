package com.cts.results.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.results.entity.Result;

@Repository
public interface ResultRepository extends JpaRepository<Result, String> {
    // You can add custom queries if needed
}
