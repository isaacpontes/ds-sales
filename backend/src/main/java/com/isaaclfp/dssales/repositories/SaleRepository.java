package com.isaaclfp.dssales.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.isaaclfp.dssales.dto.SalesSuccessDTO;
import com.isaaclfp.dssales.dto.SalesSumDTO;
import com.isaaclfp.dssales.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	@Query("SELECT new com.isaaclfp.dssales.dto.SalesSumDTO(obj.seller, SUM(obj.amount)) "
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SalesSumDTO> amountGroupedBySeller();

	@Query("SELECT new com.isaaclfp.dssales.dto.SalesSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SalesSuccessDTO> successGroupedBySeller();
}
