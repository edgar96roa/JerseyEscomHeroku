package mx.com.ipn.escom;

import java.util.Map;

import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Path("/alumnos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class AlumnoService {

	private static Map<Integer,Alumno> alumnos = new HashMap<>(); //Java collections pojo
	
	static {
		Alumno edgar = new Alumno(2015630420, "Edgar", "Roa Castellanos", "ISC", "SinCorreo@gmail.com");
		
		Alumno ana = new Alumno(2015630420, "Ana", "Roldan Mendoza", "ISC", "SinCorreo2@gmail.com");
		
		alumnos.put(1, edgar);
		alumnos.put(2, ana);
	}
	
	/**
	 *Este metodo nos regresa la lista de todos los clientes
	 *existentes en la base de datos 	
	 */
	@GET
	public List<Alumno> getAlumnos() {
		return new ArrayList<Alumno>(alumnos.values());
	}
	
	/**
	 * Guarda un alumno nuevo
	 * recibe como parametro un alumno
	 */
	
	@POST
	public void addAlumno(Alumno alumno) {
		alumnos.put(alumnos.size()+1, alumno);	
	}
	
	@DELETE
	@Path("/{alumnoId}")
	public void deleteAlumno(@PathParam("alumnoId") int id) {
		alumnos.remove(id);
	}
}