package serializacao;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Base64;

public class Deserializar {

	public static void main(String[] args) throws ClassNotFoundException, IOException{

		//String serializedObj = "rO0ABXNyABRzZXJpYWxpemFjYW8uUHJvZHV0bwAAAAAAAAABAgACSQACaWRMAARub21ldAASTGphdmEvbGFuZy9TdHJpbmc7eHAAAAABdAAJQ2hvY29sYXRl";
		String serializedObj = "rO0ABXNyABRzZXJpYWxpemFjYW8uUHJvZHV0bwAAAAAAAAABAgADSQACaWRMAAlkZXNjcmljYW90ABJMamF2YS9sYW5nL1N0cmluZztMAARub21lcQB+AAF4cAAAAAF0ABNDaG9jb2xhdGUgNzAlIENhY2F1dAAJQ2hvY29sYXRl";
        
		System.out.println("Deserializando Produto...");
        
		Produto deserializedObj = (Produto) deSerializeObjectFromString(serializedObj);
        
		System.out.println("Id:" + deserializedObj.getId());
        System.out.println("Nome:" + deserializedObj.getNome());
        System.out.println("Descricao: " + deserializedObj.getDescricao());
	}

	public static Object deSerializeObjectFromString(String s) throws IOException, ClassNotFoundException {
        byte[] data = Base64.getDecoder().decode(s);
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
        Object o = ois.readObject();
        ois.close();
        return o;
    }


}
