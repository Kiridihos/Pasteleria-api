package com.edu.utadeo.services;

import java.util.List;
import java.util.UUID;

import com.edu.utadeo.modelEntity.TipoPastel;

public interface ITipoPastelService {
	public List<TipoPastel> findAll();
	
	public TipoPastel save(TipoPastel t);
	
	public void delete(UUID id);
	
	public TipoPastel findById(UUID id);

	void delete(Long id);

	TipoPastel findById(Long id);
}
