package com.taller.entity.Api;

import javax.persistence.*;

@Entity
@Table(name="tiendas")
public class Tienda {
	
	public Tienda(String nombre, String ubicacion, String lider, String sector) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.lider = lider;
		this.sector = sector;
	}

	public Tienda() {
		
	}

	
	
	
	public long getId() {
		return  id;
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
	
	
	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}




	@Override
	public String toString() {
		return "Tiendas [id=" + id + ", nombre=" + nombre + ", ubicacion=" + ubicacion + ", lider=" + lider + ", sector"+ sector +"]";
	}




	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="ubicacion")
	private String ubicacion;
	
	@Column(name="lider")
	private String lider;
	
	@Column(name="sector")
	private String sector;

}
