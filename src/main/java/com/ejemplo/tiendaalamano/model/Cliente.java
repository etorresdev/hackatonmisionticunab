package com.ejemplo.tiendaalamano.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 100, nullable = false)
	private int documento;
	
	@Column(length = 50, nullable = false)
	private String nombre;
	
	@Column(length = 50, nullable = true)
	private String otro_nombre;
	
	@Column(length = 50, nullable = false)
	private String primer_apellido;
	
	@Column(length = 50, nullable = true)
	private String segundo_apellido;
	
	@Column(length = 50, nullable = false)
	private String correo;
	
	@Column(length = 100, nullable = false)
	private String direccion;
	
	@Column(length = 100, nullable = true)
	private String direccion_entrega;
	
	@Column(length = 100, nullable = true)
	private String direccion_entrega1;
	
	@Column(length = 100, nullable = true)
	private String direccion_entreg2;
	
	@Column(length = 20, nullable = false)
	private String telefono;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOtro_nombre() {
		return otro_nombre;
	}

	public void setOtro_nombre(String otro_nombre) {
		this.otro_nombre = otro_nombre;
	}

	public String getPrimer_apellido() {
		return primer_apellido;
	}

	public void setPrimer_apellido(String primer_apellido) {
		this.primer_apellido = primer_apellido;
	}

	public String getSegundo_apellido() {
		return segundo_apellido;
	}

	public void setSegundo_apellido(String segundo_apellido) {
		this.segundo_apellido = segundo_apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDireccion_entrega() {
		return direccion_entrega;
	}

	public void setDireccion_entrega(String direccion_entrega) {
		this.direccion_entrega = direccion_entrega;
	}

	public String getDireccion_entrega1() {
		return direccion_entrega1;
	}

	public void setDireccion_entrega1(String direccion_entrega1) {
		this.direccion_entrega1 = direccion_entrega1;
	}

	public String getDireccion_entreg2() {
		return direccion_entreg2;
	}

	public void setDireccion_entreg2(String direccion_entreg2) {
		this.direccion_entreg2 = direccion_entreg2;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	

	
}

