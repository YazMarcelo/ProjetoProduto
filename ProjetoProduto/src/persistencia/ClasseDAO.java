package persistencia;

//import classededados.Lista;
import classededados.Produto;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ClasseDAO {
    private String t = "C:\\Users\\selecta\\Documents\\NetBeansProjects\\ProjetoProduto\\ProjetoProduto\\src\\arquivos\\";
    private String c = "";
    private String f = "";
    
    private String arquivo = t + "produto.csv";
    
    public Produto[] recuperar() throws Exception {
//        Lista lista = new Lista();
//        Produto objProd = null;
        
        
//        Produto listaDeAluno[] = new Produto[30];
//        Produto objAluno = null;
//
//        FileReader frProduto = new FileReader(arquivo);
//        BufferedReader br = new BufferedReader(frProduto);
//        String linha = "";
//        int i = 0;
//        while ((linha = br.readLine()) != null) {
//            String vector[] = linha.split(";");
//
//            objAluno = new Produto();
//            objAluno.setMatricula(vector[0]);
//            objAluno.setNome(vector[1]);
//            objAluno.setTipoDeIngresso(vector[2]);
//            objAluno.setTurno(vector[3]);
//            objAluno.setMatriz(vector[4]);
//
//            listaDeAluno[i] = objAluno;
//            i++;
//        }
//        br.close();
//        return listaDeAluno;
return null;
    }
}
