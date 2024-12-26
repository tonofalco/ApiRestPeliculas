package com.mx.ApiRestPeliculas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PELICULAS_API")
@NoArgsConstructor // constructor vacio
@AllArgsConstructor // constructor con parametros
@Data // ToString, Getters, Setters
public class Peliculas {

	@Id // Poner este estereotioi i anotacion -- llave primary, identificador unico
	@Column(name = "ID_PELICULA", columnDefinition = "NUMBER", nullable = false)
	private Integer idPeliculas;
	
	@Column(name = "NOMBRE", columnDefinition = "VARCHAR2(70)", nullable = false)
	private String nombre;
	
	@Column(name = "GENERO", columnDefinition = "VARCHAR2(70)", nullable = false)
	private String genero;
	
	@Column(name = "PRECIO", columnDefinition = "NUMBER", nullable = false)
	private String precio;

}
