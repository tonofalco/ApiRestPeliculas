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
	public void guardar(Peliculas pelicula) {
		// TODO Auto-generated method stub
		dao.save(pelicula);
	}

	@Transactional
	@Override
	public Peliculas buscar(int idPelicula) {
		// TODO Auto-generated method stub
		return dao.findById(idPelicula).orElse(null);
	}

	@Override
	public void editar(Peliculas pelicula) {
		// TODO Auto-generated method stub
		dao.save(pelicula);
	}

	@Override
	public void eliminar(int idPelicula) {
		// TODO Auto-generated method stub
		dao.deleteById(idPelicula);
	}

}
