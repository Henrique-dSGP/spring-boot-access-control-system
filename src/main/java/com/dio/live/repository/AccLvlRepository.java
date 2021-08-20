package com.dio.live.repository;

import com.dio.live.model.AccessLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccLvlRepository extends JpaRepository<AccessLevel, Long> {
}
