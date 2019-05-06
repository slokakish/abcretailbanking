package com.hcl.retailbanking.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.retailbanking.entities.ManagePayee;

@Repository
public interface ManagePayeeRepository extends JpaRepository<ManagePayee, Long> {

	@Query(value="SELECT * FROM MANAGE_PAYEE WHERE PAYEE_ID=?",nativeQuery= true)
	List<ManagePayee> findAllByPayId(Long payee_id);
	
}