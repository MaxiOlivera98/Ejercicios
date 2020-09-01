package ui;

import java.util.ArrayList;
import java.util.Scanner;

import entities.*;
import logic.Login;

public class Menu {
	Scanner s = null;
	Login ctrlLogin = new Login();

	public void start() {
		s = new Scanner(System.in);
		Persona p = login();
		System.out.println();
		System.out.println("¡Bienvenido " + p.getNombre() + " " + p.getApellido() + "!");
		System.out.println();
		
		String command;
		do {
			command = getCommand();
			executeCommand(command);
			System.out.println();
			
		}while(!command.equalsIgnoreCase("exit"));
		
		s.close();
	}

	private void executeCommand(String command) {
		switch (command) {
		case "list":
			System.out.println(ctrlLogin.getAll());
			break;
		case "find":
			System.out.println(find());
			break;
		case "search":
			for (Persona p : search()) {
				System.out.print(p);
			}
			System.out.println();
			break;
		case "new":
			System.out.println("Nueva persona agregada" + newPersona());
			break;
		case "edit":
			System.out.println("Persona modificada" + edit());
			break;
		case "delete":
			System.out.println("Persona eliminada" + delete());
			break;
		default:
			break;
		}
	}

	private String getCommand() {
		System.out.println("Ingrese el comando según la opción que desee realizar:");
		System.out.println("\tlist\t--->\tListar todas las personas registradas");
		System.out.println("\tfind\t--->\tBuscar persona por tipo y nro de documento"); //solo debe devolver 1
		System.out.println("\tsearch\t--->\tBuscar persona/s por apellido"); //puede devolver varios
		System.out.println("\tnew\t--->\tRegistrar una nueva persona y asignar un rol existente");
		System.out.println("\tedit\t--->\tBuscar persona por tipo y nro de documento y actualizar sus datos");
		System.out.println("\tdelete\t--->\tEliminar persona");
		System.out.println("\texit\t--->\tSalir");
		System.out.println();
		System.out.print("comando: ");
		return s.nextLine();
	}
	
	public Persona login() {
		Persona p = new Persona();
		
		System.out.print("Email: ");
		p.setEmail(s.nextLine());

		System.out.print("password: ");
		p.setPassword(s.nextLine());
		
		p = ctrlLogin.validate(p);
		
		return p;
	}
	
	private Persona find() {
		System.out.println();
		Persona p = new Persona();
		Documento d = new Documento();
		p.setDocumento(d);
		System.out.print("Tipo doc: ");
		d.setTipo(s.nextLine());

		System.out.print("Nro doc: ");
		d.setNro(s.nextLine());
		
		return ctrlLogin.getByDocumento(p);
	}
	
	private ArrayList <Persona> search() {
		System.out.println();
		Persona p = new Persona();
		Documento d = new Documento();
		p.setDocumento(d);
		
		System.out.print("Apellido: ");
		p.setApellido(s.nextLine());
		
		return ctrlLogin.getByApellido(p);
	}
	
	private Persona newPersona() {
		System.out.println();
		Persona p = new Persona();
		Documento d = new Documento();
		p.setDocumento(d);
		
		System.out.println("Ingrese los datos de la persona a agregar:");
		
		System.out.print("\tTipo doc: ");
		d.setTipo(s.nextLine());
		
		System.out.print("\tNro doc: ");
		d.setNro(s.nextLine());
		
		System.out.print("\tNombre: ");
		p.setNombre(s.nextLine());
		
		System.out.print("\tApellido: ");
		p.setApellido(s.nextLine());
		
		System.out.print("\tEmail: ");
		p.setEmail(s.nextLine());
		
		System.out.print("\tTelefono: ");
		p.setTel(s.nextLine());
		
		System.out.print("\tContraseña: ");
		p.setPassword(s.nextLine());
		
		System.out.print("\tPresione (1) si esta habilitado o cualquier numero si no esta habilitado: ");
		String hab = s.nextLine();
		if(Integer.parseInt(hab) == 1) {
			p.setHabilitado(true);
		}  else p.setHabilitado(false);
		
		System.out.println("\tRoles:");
		for (Rol rol:ctrlLogin.getAllRoles()) {
			System.out.println("\t\t" + rol.getId() + ": " + rol.getDescripcion());
		};
		System.out.print("\tIngrese el rol para este usuario: ");
		Rol rol = new Rol();
		rol.setId(s.nextInt());
		rol = ctrlLogin.getRolById(rol);
		p.addRol(rol);
		System.out.println();
		
		return ctrlLogin.addPersona(p);
	}
	
	private Persona edit() {
		System.out.println();
		Persona p = new Persona();
		Documento d = new Documento();
		p.setDocumento(d);
		
		System.out.println("Ingrese tipo y numero de Documento de la persona a modificar datos");
		
		System.out.print("\tTipo doc: ");
		d.setTipo(s.nextLine());

		System.out.print("\tNro doc: ");
		d.setNro(s.nextLine());
		
		p = ctrlLogin.getByDocumento(p);
		System.out.println();
		
		System.out.println("Ingrese los datos a modificar");
		
		System.out.print("\tNombre: ");
		p.setNombre(s.nextLine());
		
		System.out.print("\tApellido: ");
		p.setApellido(s.nextLine());
		
		System.out.print("\tEmail: ");
		p.setEmail(s.nextLine());

		System.out.print("\tTelefono: ");
		p.setTel(s.nextLine());
		
		System.out.print("\tContraseña: ");
		p.setPassword(s.nextLine());
		
		System.out.print("\tPresione (1) si esta habilitado o cualquier numero si no esta habilitado: ");
		String hab = s.nextLine();
		if(Integer.parseInt(hab) == 1) {
			p.setHabilitado(true);
		}  else p.setHabilitado(false);
		
		System.out.println("\tRoles:");
		for (Rol rol:ctrlLogin.getAllRoles()) {
			System.out.println("\t\t" + rol.getId() + ": " + rol.getDescripcion());
		};
		System.out.print("\tIngrese el rol para este usuario: ");
		Rol rol = new Rol();
		rol.setId(s.nextInt());
		rol = ctrlLogin.getRolById(rol);
		p.addRol(rol);
		System.out.println();
		
		return ctrlLogin.edit(p);
	}
	
	private Persona delete() {
		System.out.println();
		Persona p = new Persona();
		Documento d = new Documento();
		p.setDocumento(d);
		System.out.println("Ingrese tipo y numero de Documento de la persona a eliminar");
		
		System.out.print("\tTipo doc: ");
		d.setTipo(s.nextLine());

		System.out.print("\tNro doc: ");
		d.setNro(s.nextLine());
		
		p = ctrlLogin.getByDocumento(p);
		System.out.println();
		
		return ctrlLogin.delete(p);
	}
}