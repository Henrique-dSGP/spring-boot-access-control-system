package com.dio.live.repository;

import com.dio.live.model.UserCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsrCatRepository extends JpaRepository<UserCategory, Long> {
}
