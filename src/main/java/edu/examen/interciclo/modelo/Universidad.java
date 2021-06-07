package edu.examen.interciclo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "universidades_table")
public class Universidad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nombre_universidad", columnDefinition = "text")
	private String nombre;
	
	@Column(length = 100)
	private String descripcion;
	
	@Column(length = 30)	
	private String direccion;

	private int telefono;
	
	private int nroEstudiantes;
	
	@Column(length = 30)
	private String correoElectronico;

	
	
	public Universidad( String nombre, String descripcion, String direccion, int telefono, int nroEstudiantes,
			String correoElectronico) {
		super();	
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.telefono = telefono;
		this.nroEstudiantes = nroEstudiantes;
		this.correoElectronico = correoElectronico;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public int getTelefono() {
		return telefono;
	}



	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}



	public int getNroEstudiantes() {
		return nroEstudiantes;
	}



	public void setNroEstudiantes(int nroEstudiantes) {
		this.nroEstudiantes = nroEstudiantes;
	}



	public String getCorreoElectronico() {
		return correoElectronico;
	}



	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}



	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", nroestudiantes=" + nroEstudiantes + ", correoelectronico=" + correoElectronico+"]";
	}

}
