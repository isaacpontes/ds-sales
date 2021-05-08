package com.isaaclfp.dssales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isaaclfp.dssales.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
