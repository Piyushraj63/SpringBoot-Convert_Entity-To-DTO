package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.model.Location;

public interface LocationRepository extends JpaRepository<Location , Long>{

}
