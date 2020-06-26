package com.servicio_rest_2.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User implements Serializable {
    private static final long serialVersionUID = 4894729030347835498L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String nombre;
	private String apaterno;
	private String amaterno;
	  
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApaterno() {
		return apaterno;
	}
	
	public void setApaterno(String apaterno) {
		this.apaterno = apaterno;
	}
	
	public String getAmaterno() {
		return amaterno;
	}
	
	public void setAmaterno(String amaterno) {
		this.amaterno = amaterno;
	}
}
