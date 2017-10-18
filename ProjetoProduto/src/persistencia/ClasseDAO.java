package persistencia;

import classededados.Lista;
import classededados.Produto;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ClasseDAO {
    private String t = "C:\\Users\\selecta\\Documents\\NetBeansProjects\\ProjetoProduto\\ProjetoProduto\\src\\arquivos\\";
    private String c = "C:\\Users\\HELM\\Documents\\NetBeansProjects\\ProjetoProduto\\ProjetoProduto\\src\\arquivos\\";
    private String f = "";
    
    private String arquivo = c + "produto.csv";
    
    public Lista recuperar() throws Exception {
        Lista lista = new Lista();
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
