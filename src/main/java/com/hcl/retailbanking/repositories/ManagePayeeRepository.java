package com.hcl.retailbanking.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.retailbanking.entities.ManagePayee;

@Repository
public interface ManagePayeeRepository extends JpaRepository<ManagePayee, Long> {

	List<ManagePayee> findAllById(Long id);

}