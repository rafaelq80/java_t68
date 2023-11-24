package serializacao;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Base64;

public class Serializar {

	public static void main(String[] args) throws ClassNotFoundException, IOException{

		//Produto p1 = new Produto(1, "Chocolate");
		
		Produto p1 = new Produto(1, "Chocolate", "Chocolate 70% Cacau");
		p1.visualizar();

		String serializedObj = serializeObjectToString(p1);

		System.out.println("Serializar Produto:");
		System.out.println(serializedObj);
	}

	public static String serializeObjectToString(Serializable o) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		oos.writeObject(o);
		oos.close();
		return Base64.getEncoder().encodeToString(baos.toByteArray());
	}

}
