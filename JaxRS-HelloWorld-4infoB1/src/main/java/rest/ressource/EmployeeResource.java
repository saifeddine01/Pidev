package rest.ressource;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;


@Path("employes")
public class EmployeeResource {
	public static List<Employee> ListeEmploye = new ArrayList<Employee>();
	Employee e = new Employee("098","saif","sassi");
	
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	public Response addEmployee(Employee employe) {
			ListeEmploye.add(employe);
			return Response.status(Status.OK).entity("add successful").build();
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response afficherListEmploye() {
		ListeEmploye.add(e);
		return Response.status(Status.OK).entity(ListeEmploye).build();
	}

}
