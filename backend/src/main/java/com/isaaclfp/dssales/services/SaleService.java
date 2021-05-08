package com.isaaclfp.dssales.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isaaclfp.dssales.dto.SaleDTO;
import com.isaaclfp.dssales.dto.SalesSuccessDTO;
import com.isaaclfp.dssales.dto.SalesSumDTO;
import com.isaaclfp.dssales.entities.Sale;
import com.isaaclfp.dssales.repositories.SaleRepository;
import com.isaaclfp.dssales.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SalesSumDTO> amountGroupedBySeller() {
		return repository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SalesSuccessDTO> successGroupedBySeller() {
		return repository.successGroupedBySeller();
	}
}
