package edu.examen.interciclo.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Universidad {
    @Id
	private int Id;
	
	private String Nombre;
	private String Descripcion;
	private String Direccion;
	private int Telefono;
	private int NroEstudiantes;
	private String CorreoElectronico;

	public Universidad(int id, String nombre, String descripcion, String direccion, int telefono, int nroEstudiantes,
			String correoElectronico) {
		super();
		Id = id;
		Nombre = nombre;
		Descripcion = descripcion;
		Direccion = direccion;
		Telefono = telefono;
		NroEstudiantes = nroEstudiantes;
		CorreoElectronico = correoElectronico;

	}

	public Universidad() {
		super();
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public int getTelefono() {
		return Telefono;
	}

	public void setTelefono(int telefono) {
		Telefono = telefono;
	}

	public int getNroEstudiantes() {
		return NroEstudiantes;
	}

	public void setNroEstudiantes(int nroEstudiantes) {
		NroEstudiantes = nroEstudiantes;
	}

	public String getCorreoElectronico() {
		return CorreoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		CorreoElectronico = correoElectronico;
	}

}
