package projetolerjson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ProjetoLerJson {

	public static void main(String[] args) {

		JSONObject js;
		JSONParser jp = new JSONParser();
		LerPessoaJson lp = new LerPessoaJson();
		
		try {
			js = (JSONObject) jp.parse(new FileReader("C:\\Dev\\JAVA\\CursoUdemy\\recursos\\Arquivo.json"));
			
			lp.setNome((String) js.get("nome")); 
			lp.setSobrenome((String) js.get("sobrenome")); 
			lp.setCidade((String) js.get("cidade")); 
			System.out.println(lp.toString());
			
		} catch (org.json.simple.parser.ParseException p) {
			System.out.println(p.getMessage());
		} catch (FileNotFoundException f) {
			System.out.println(f.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
