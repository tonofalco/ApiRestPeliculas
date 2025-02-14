package com.mx.ApiRestPeliculas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.ApiRestPeliculas.model.Peliculas;

import com.mx.ApiRestPeliculas.service.PeliculasServImp;

@RestController
@RequestMapping(path = "PeliculasWebServices")
@CrossOrigin
public class PeliculasWebServices {
	
	@Autowired
	PeliculasServImp imp;
	
	@GetMapping(path = "listar")
	public List<Peliculas> listar() {
		return imp.listar();
	}
	
	@PostMapping(path ="guardar")
	public void guardar(@RequestBody Peliculas pelicula) {
		imp.guardar(pelicula);
	}
	
	@PostMapping(path ="buscar")
	public Peliculas buscar(@RequestBody Peliculas pelicula) {
		return imp.buscar(pelicula.getIdPeliculas());
	}
	
	@PostMapping(path ="editar")
	public void editar(@RequestBody Peliculas pelicula) {
		imp.editar(pelicula);
	}
	
	@PostMapping(path ="eliminar")
	public void elminar(@RequestBody Peliculas pelicula) {
		imp.eliminar(pelicula.getIdPeliculas());
	}

}
