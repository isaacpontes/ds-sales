package com.isaaclfp.dssales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isaaclfp.dssales.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
