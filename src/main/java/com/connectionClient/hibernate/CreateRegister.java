package com.connectionClient.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateRegister {

	public static void main(String[] args) {
	//con esta instruccion se crea el factory 
	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Tiendas.class).buildSessionFactory();
	
	Session sesion=factory.openSession();
	try {
		Tiendas tienda1= new Tiendas("Megaconstructor","Bello","Martha");
		//sesion.beginTransaction();
		sesion.save(tienda1);
		sesion.beginTransaction().commit();
		
		System.out.println("Registro guardado exitosamente");
		//sesion.beginTransaction();
		System.out.println("lectura de registro Id: "+tienda1.getId());
		Tiendas tiendaInsertada=sesion.get(Tiendas.class, tienda1.getId());
		
		
	}catch(Exception e){
		e.printStackTrace();
	}
	finally {
		//se cierra el factory
		factory.close();
		sesion.close();
	}
 }
}
