package com.mx.ApiRestPeliculas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.ApiRestPeliculas.dao.PeliculasDao;
import com.mx.ApiRestPeliculas.model.Peliculas;

@Service
public class PeliculasServImp implements PeliculasServ {
	
	@Autowired
	PeliculasDao dao;

	@Transactional(readOnly = true)
	@Override
	public List<Peliculas> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public void guardar(Peliculas cliente) {
		// TODO Auto-generated method stub
		dao.save(cliente);
	}

	@Transactional
	@Override
	public Peliculas buscar(int idCliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editar(Peliculas cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int idCliente) {
		// TODO Auto-generated method stub
		
	}

}
