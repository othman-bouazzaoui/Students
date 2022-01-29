package com.tawdi7atnet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tawdi7atnet.entity.School;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {

}
