package com.carlosmantilla.profesoresplatzi.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractSession {
	
	//una clase abstracta la idea es que cuando se ejecute la herencia sea obligatorio sobreescribir o traer los métodos

	
	@Autowired //Con Autowired ve y encuentra la instanciacón y persistelo aquí
	private SessionFactory sessionFactory;
	
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
}
