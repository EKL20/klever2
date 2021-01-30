package com.connectionClient.hibernate;

import javax.persistence.*;

@Entity
@Table(name="tiendas")
public class Tiendas {
	
	public Tiendas(String nombre, String ubicacion, String lider) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.lider = lider;
	}

	public Tiendas() {
		super();
	}

	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getLider() {
		return lider;
	}

	public void setLider(String lider) {
		this.lider = lider;
	}




	@Override
	public String toString() {
		return "Tiendas [id=" + id + ", nombre=" + nombre + ", ubicacion=" + ubicacion + ", lider=" + lider + "]";
	}




	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="ubicacion")
	private String ubicacion;
	
	@Column(name="lider")
	private String lider;

}
