package com.taller.CRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taller.Service.Api.TiendaServiceApi;
import com.taller.entity.Api.Tienda;

@RestController
@RequestMapping(value="/api/v1")
public class TiendaRestController {
	@Autowired
	private TiendaServiceApi tiendaServiceApi;
	
	@GetMapping(value="/all")
	public List<Tienda> getAll(){
		return tiendaServiceApi.getAll();
	}
	@PostMapping(value="/save")
	public ResponseEntity<Tienda> save(@RequestBody Tienda tienda){
		Tienda obj = tiendaServiceApi.save(tienda);
		return new ResponseEntity<Tienda>(obj, HttpStatus.OK);	
	}
	
	@GetMapping(value="/delete/{id}")
	public ResponseEntity<Tienda> delete(@PathVariable Long id){
		Tienda tienda = tiendaServiceApi.get(id);
		if(tienda != null) {
			tiendaServiceApi.delete(id);
		}else {
			return new ResponseEntity<Tienda>(tienda, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Tienda>(tienda, HttpStatus.OK);
	}
}
		
