package com.kemisch.hangover.repositories;


import com.kemisch.hangover.domain.Input;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InputRepository extends JpaRepository<Input, Long> {
}
