package com.taller.Serviceimpl.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.taller.CRUD.commons.GenericServiceImpl;
import com.taller.DAO.Api.TiendaDaoApi;
import com.taller.Service.Api.TiendaServiceApi;
import com.taller.entity.Api.Tienda;

@Service
public class TiendaServiceImplement extends GenericServiceImpl<Tienda, Long> implements TiendaServiceApi {

	@Autowired
	private TiendaDaoApi tiendaDaoApi;
	@Override
	public CrudRepository<Tienda, Long> getDao() {
		return tiendaDaoApi;
	}

}
