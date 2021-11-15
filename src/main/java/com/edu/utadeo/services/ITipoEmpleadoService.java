package com.edu.utadeo.services;

import java.util.List;
import java.util.UUID;

import com.edu.utadeo.modelEntity.Empleado;
import com.edu.utadeo.modelEntity.TipoEmpleado;

public interface ITipoEmpleadoService {
	public List<TipoEmpleado> findAll();
	
	public TipoEmpleado save(TipoEmpleado e);
	
	public void delete(UUID id);
	
	public TipoEmpleado findById(UUID id);

	void delete(Long id);

	TipoEmpleado findById(Long id);
}
