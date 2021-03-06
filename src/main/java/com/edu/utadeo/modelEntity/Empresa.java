package com.edu.utadeo.modelEntity;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="empresas", uniqueConstraints = { @UniqueConstraint(columnNames = { "nit" }) })
public class Empresa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private UUID id;
	
	@NotNull
	@Column
	private long nit;
	
	@NotNull
	@Column
	private String nombre;
	
	@NotNull
	@Column
	private String direccion;
	
	@OneToOne
	@JoinColumn(name="persona")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Persona persona;
	
	//Getters and Setters
	public long getNit() {
		return nit;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public void setNit(long nit) {
		this.nit = nit;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}
