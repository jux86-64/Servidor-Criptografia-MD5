package controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import jakarta.ws.rs.Path;
import jakarta.xml.bind.DatatypeConverter;

@Path("/md5")
public class Criptografa implements ICriptografa {
	
	@Override
	public String gerarMD5(String chave) throws NoSuchAlgorithmException {
	    MessageDigest md = MessageDigest.getInstance("MD5");
	    md.update(chave.getBytes());
	    byte[] digest = md.digest();
	    return DatatypeConverter.printHexBinary(digest).toUpperCase();
	}
}
