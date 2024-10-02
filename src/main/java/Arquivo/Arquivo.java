package Arquivo;

import java.io.*;

public class Arquivo {

    public static StringBuilder lerArquivo(String path) {
        String linha;
        var msg = new StringBuilder();
        try {
            var arquivo = new FileReader(path);
            var bufferedReader = new BufferedReader(arquivo);
            while ((linha = bufferedReader.readLine()) != null) {
                msg.append(linha).append("\n");
            }
        } catch (NullPointerException | IOException e) {
            System.out.println("Erro linha nula ou IOException");
        }
        return msg;
    }


}
