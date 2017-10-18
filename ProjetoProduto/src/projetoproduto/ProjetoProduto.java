/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoproduto;

import classededados.Lista;
import classededados.Produto;
import java.util.Scanner;
import persistencia.ClasseDAO;

/**
 *
 * @author HELM
 */
public class ProjetoProduto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        Scanner leia = new Scanner(System.in);
        Lista lista = new Lista();
        System.out.println("Bem Vindo!");
        System.out.println("Dados na lista: ");
        ClasseDAO dao = new ClasseDAO();
        lista = dao.recuperar();
        lista.mostraLista();

        String num = lista.perguntar();

        while (!(num.equals("$"))) {
            
            if (Integer.parseInt(num) == 1) {
                System.out.println("Digite o código: ");
                int codigo = leia.nextInt();
                while(lista.verificarCodigo(codigo)){
                    System.out.println("Código já existente!");
                    System.out.println("Digite outro Número:");
                    codigo = leia.nextInt();
                }
                System.out.println("Digite o Nome do Produto: ");
                String nome = leia.next();
                System.out.println("Digite o Valor do Produto: ");
                Double valor = leia.nextDouble();

                Produto prod = new Produto(codigo, nome, valor);
                lista.insereOrdenado(prod);
            } else if (Integer.parseInt(num) == 2) {
                System.out.println("Digite o código do Produto que deseja remover: ");
                int codigo = leia.nextInt();
                while(!(lista.verificarCodigo(codigo))){
                    System.out.println("Código não existente!");
                    System.out.println("Digite outro Número:");
                    codigo = leia.nextInt();
                }
                Produto aux = lista.remover(codigo);
                System.out.println("Produto removido: \n"+aux.getCodigo() +" - "+aux.getDescricao()+" - "+aux.getValor());
            }else if (Integer.parseInt(num) == 3) {
                System.out.println("Digite o código do Produto que deseja alterar: ");
                int codigo = leia.nextInt();
                while(!(lista.verificarCodigo(codigo))){
                    System.out.println("Código não existente!");
                    System.out.println("Digite outro Número:");
                    codigo = leia.nextInt();
                }
                Produto aux = lista.buscarProduto(codigo);
                System.out.println("Produto encontrado: \n"+aux.getCodigo() +" - "+aux.getDescricao()+" - "+aux.getValor());
                
                System.out.println("Altere o Nome do Produto: ");
                String nome = leia.next();
                System.out.println("Altere o Valor do Produto: ");
                Double valor = leia.nextDouble();

                Produto prod = new Produto(codigo, nome, valor);
                
                lista.alterar(prod);
            }else if (Integer.parseInt(num) == 4) {
                lista.mostraLista();
            }
            
        num = lista.perguntar();
        }

    }

}
