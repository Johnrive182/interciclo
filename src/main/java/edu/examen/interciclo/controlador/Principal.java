package edu.examen.interciclo.controlador;

import java.util.List;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import edu.examen.interciclo.infraestructura.repositorio.UniversidadRepository;
import edu.examen.interciclo.modelo.Universidad;

@Controller
public class Principal {

	@Autowired
	UniversidadRepository UniversidadRepository;
	public Principal() {

	}
	public void GUI() {
		Scanner scan = new Scanner(System.in);
		int entradaTeclado;
		do {
			System.out.println("**************MENÚ PRINCIPAL*********************");
			System.out.println(" ");
			System.out.println("1. Ingresar Universidad ");
			System.out.println("2. Modificar Universidad ");
			System.out.println("3. Eliminar Universidad ");
			System.out.println("4. Listar Universiades ");
			System.out.println("5. Salir ");
			entradaTeclado = scan.nextInt();
			switch (entradaTeclado) {
			case 1:
				
					System.out.println("Ingrese el nombre: ");
					String nombre = scan.next();
					System.out.println("Ingrese la descripcion: ");
					String descripcion = scan.next();
					System.out.println("Ingrese la direccion: ");
					String direccion = scan.next();
					System.out.println("Ingrese el teléfono: ");
					int telefono = scan.nextInt();
					System.out.println("Ingrese el numero de estudiantes: ");
					int nroEstudiantes = scan.nextInt();
					System.out.println("Ingrese la correoElectronico: ");
					String correoElectronico = scan.next();

					Universidad uni = new Universidad(nombre, descripcion, direccion, telefono, nroEstudiantes,correoElectronico);
					UniversidadRepository.save(uni);
		
				break;
			case 2:

					System.out.println("Ingrese la universidad que quiera modificar ");
					String uni1 = scan.next();

					Universidad unimodificada = UniversidadRepository.findByNombreUni(uni1);

					System.out.println("Ingrese la nueva universidad: ");
					String en = scan.next();
					unimodificada.setNombre(en);
					UniversidadRepository.save(unimodificada);

				break;
			case 3:
			
					System.out.println("Ingrese la universidad que desea eliminar: ");
					String nomb = scan.next();
					List<Universidad> uninom = UniversidadRepository.findByNombre(nomb);
					System.out.println("Id|" + "\t" + "|Nombre|" + "\t" + "|Direccion|" + "\t" + "|Telefono|");
					for (Universidad universidad : uninom) {
						System.out.println(universidad.getId() + " " +universidad.getNombre() + " " + universidad.getDireccion() + " "
								+ universidad.getTelefono());
					}
					System.out.println("Ingrese el id que quiera eliminar: ");
					int id = scan.nextInt();
					Universidad unid = UniversidadRepository.findById(id);
					UniversidadRepository.delete(unid);


				break;
			case 4:

				System.out.println("Ingrese la universidad que desee buscar: ");
				String nom = scan.next();
				List<Universidad> universidades = UniversidadRepository.findByNombre(nom);
				System.out.println("Id|" + "\t" + "|Nombre|" + "\t" + "|Apellido|");
				for (Universidad universidad : universidades) {
					System.out.println(universidad.getId() + " " +universidad.getNombre() + " " + universidad.getDireccion() + " "
							+ universidad.getTelefono());
				}
				break;
			case 5:
				System.exit(0);
				break;

			default:
				break;
			}
		} while (entradaTeclado != 5);

	}
}
