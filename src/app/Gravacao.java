package app;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import app.Questionario;
import app.Questao;

public class Gravacao {

	public void gravaArquivo(){
	try{
            FileWriter arquivo = new FileWriter("arquivo.txt", true); /* escrita do arquivo */
            String tituloDoArquivo = new String ("Questionario avaliativo:"); /* conteúdo do plano */

            String mascara = "%s,%s,%s,%s,%s\n";
            for (int turma = 0; turma < this.questionario; questionario++) {


                String toSave = String.format(mascara, Questionario.Questao.getTitulo().getTipo(), questionario.getNumerica().getTitulo().getTipo()),questionario.getMuplicaEscolha().getTitulo().getTipo(),questionario.getAlternativa().getTitulo().getTipo().getAlternativas(),plano);

                arquivo.write(toSave);
            }

            arquivo.close();
        }catch(Exception e){
            System.out.println("Erro na escrita do arquivo");
        }

    }
	
}


