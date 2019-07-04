package projetocriarescrevejson;

import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;


public class ProjetoCriarEscreverJson {

	public static void main(String[] args) {

		FileWriter fw = null;//criar o arquivo
		JSONObject jo = new JSONObject();
		try {
			//criar um objeto JSON
			
			
			//Armazenar os dados no objeto
			jo.put("nome", "Maria");
			jo.put("sobrenome", "Costa");
			jo.put("cidade", "Monte Mor");
			
			String fileJson = "C:\\Dev\\JAVA\\CursoUdemy\\recursos\\Arquivo.json";//caminho onde será criado o arquivo
			fw = new FileWriter(fileJson);
			
			fw.write(jo.toString());
			fw.close();
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		// vai conferir o que foi salvo
		System.out.println(jo);
	}

}
