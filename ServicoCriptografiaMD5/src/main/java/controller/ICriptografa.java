package controller;

import java.security.NoSuchAlgorithmException;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


public interface ICriptografa {
	@GET
	@Path("/{palavra}")
	@Produces(MediaType.APPLICATION_JSON)
	public String gerarMD5(@PathParam("palavra")String param) throws NoSuchAlgorithmException;
}
