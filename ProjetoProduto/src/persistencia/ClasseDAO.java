package persistencia;

import classededados.Lista;
import classededados.Produto;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClasseDAO {
    private String t = "C:\\Users\\selecta\\Documents\\NetBeansProjects\\ProjetoProduto\\ProjetoProduto\\src\\arquivos\\";
    private String c = "C:\\Users\\HELM\\Documents\\NetBeansProjects\\ProjetoProduto\\ProjetoProduto\\src\\arquivos\\";
    private String f = "C:\\Users\\aluno\\Documents\\NetBeansProjects\\ProjetoProduto\\ProjetoProduto\\src\\arquivos\\";
    
    private String arquivo = f + "produto.csv";
    Lista lista = new Lista();
    
    public Lista recuperar() throws Exception {
        
        Produto objProd = null;


        FileReader frProduto = new FileReader(arquivo);
        BufferedReader br = new BufferedReader(frProduto);
        String linha = "";
        int i = 0;
        while ((linha = br.readLine()) != null) {
            String vector[] = linha.split(";");

            objProd = new Produto();
            objProd.setCodigo(Integer.parseInt(vector[0]));
            objProd.setDescricao(vector[1]);
            objProd.setValor(Double.parseDouble(vector[2]));

            lista.insereOrdenado(objProd);
        }
        br.close();
        return lista;
    }
}
