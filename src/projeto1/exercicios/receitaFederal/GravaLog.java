package projeto1.exercicios.receitaFederal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class GravaLog {

	public void gravarLog (Exception e) throws Exception {
		Path path = Paths.get("C:/eclipse/Workspace/projeto1/src/projeto1/exercicios/receitaFederal/log/Error.txt");
		Charset utf8 = StandardCharsets.UTF_8;
		BufferedWriter escreverArquivo;
		
		Boolean diretorioExitente = Files.exists(path.getParent());
		
		if (diretorioExitente) {
			Boolean arquivoExistente = Files.exists(path);
			
			if (arquivoExistente) {				
				BufferedReader lerArquivo = Files.newBufferedReader(path);
				String line = null;
				ArrayList<String> listaErros = new ArrayList<String>();
				
				while ((line = lerArquivo.readLine()) != null) {
					listaErros.add(line);
				}
				
				escreverArquivo = Files.newBufferedWriter(path, utf8);
				
				for (String string : listaErros) {
					escreverArquivo.write(string);
					escreverArquivo.newLine();
				}
				escreverArquivo.newLine();
				escreverArquivo.write(e.fillInStackTrace().toString());
				escreverArquivo.close();
										
			} else {
				Files.createFile(path);
				escreverArquivo = Files.newBufferedWriter(path, utf8);
				escreverArquivo.write(e.fillInStackTrace().toString());
				escreverArquivo.close();
				} 
		} else {
				Files.createDirectories(path.getParent());
				Files.createFile(path);
				escreverArquivo = Files.newBufferedWriter(path, utf8);
				escreverArquivo.write(e.fillInStackTrace().toString());
				escreverArquivo.close();								
			   }
		}
	
}
