package com.hcl.retailbanking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.retailbanking.entities.CustomerCreationEntity;


@Repository
public interface CustomerCreationRepository extends JpaRepository<CustomerCreationEntity, Long> {

}
