package com.edu.utadeo.modelEntity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="etapa_pastel")
public class EtapaPastel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	@Column
	private float tempCoccion;

	@Column
	private Date fechaInicio;

	@Column
	private Date fechaFin;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="hornos.id")
	private Horno hornoAsignado;
	
	
	//Getters and Setters

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public float getTempCoccion() {
		return tempCoccion;
	}

	public void setTempCoccion(float tempCoccion) {
		this.tempCoccion = tempCoccion;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Horno getHornoAsignado() {
		return hornoAsignado;
	}

	public void setHornoAsignado(Horno hornoAsignado) {
		this.hornoAsignado = hornoAsignado;
	}
	
	
}