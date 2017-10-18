/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoproduto;

import classededados.Lista;
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
        Lista lista = new Lista();
        System.out.println("Blá!");
        ClasseDAO dao = new ClasseDAO();
        lista = dao.recuperar();
        lista.mostraLista();
    }
    
}
