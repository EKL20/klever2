package com.taller.CRUD.commons;

import java.io.Serializable;
import java.util.List;


//Por medio de esta interface se pretende generar los metodos repetitivos del CRUD, Sin tener que usar una 
//clase que haga todo 
public interface GenericServiceApi<T, ID extends Serializable> {
	
	//Metodo Guardar
	T save (T entity);
	
	//Metodo eliminar
	void delete(ID id);
	
	//metodo Obtener por id
	T get(ID id);
	
	//Listar todo
	List<T> getAll();
	

}
