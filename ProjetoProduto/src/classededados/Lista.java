/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classededados;

import java.util.Scanner;

/**
 *
 * @author selecta
 */
public class Lista {

    private Produto primeiro;
    private Produto ultimo;

    public Lista() {
        primeiro = null;
        ultimo = null;
    }

    public boolean eVazia() {
        return primeiro == null;
    }

    public void insereInicio(Produto elemento) {
        if (eVazia()) {
            ultimo = elemento;
        } else {
            elemento.setProximo(primeiro);
        }
        primeiro = elemento;

    }

    public void insereFim(Produto elemento) {
        if (eVazia()) {
            insereInicio(elemento);
        } else {
            ultimo.setProximo(elemento);
            ultimo = elemento;
        }

    }

    public void insereOrdenado(Produto elemento) {
        int codigo = elemento.getCodigo();
        String descricao = elemento.getDescricao();
        double valor = elemento.getValor();

        if (eVazia()) {
            insereInicio(new Produto(codigo, descricao, valor));
        } else {
            Produto atual = new Produto();
            atual = primeiro;
            Produto anterior = null;
            Produto inserido = new Produto(codigo, descricao, valor);

            while (atual != null && codigo > atual.getCodigo()) {
                anterior = atual;
                atual = atual.getProximo();
            }

            if (anterior == null) {
                insereInicio(inserido);
                return;
            }

            if (atual == null) {
                insereFim(inserido);
                return;
            }

            anterior.setProximo(inserido);
            inserido.setProximo(atual);

        }

    }
    
    public void alterar(Produto elemento) {
        int codigo = elemento.getCodigo();

        Produto aux = remover(codigo);
        insereOrdenado(elemento);
    }
    
    public Produto remover(int numero) {
        if (eVazia()) {
            return null;
        }

        Produto anterior = new Produto();
        Produto atual = new Produto();
        atual = primeiro;
        anterior = null;
        
        while (atual != null && atual.getCodigo() != numero) {
            anterior = atual;
            atual = atual.getProximo();
        }
        //elemento não existe na lista
        if (atual == null) {
            return null;
        }

        //O elemento a ser removido está no atual
        Produto removido = atual;

        //supondo remoção no inicio
        if (anterior == null) {
            //??
            if (primeiro.getProximo() == null) {
                primeiro = ultimo = null;
            } else {
                primeiro = atual.getProximo();
            }
            removido.setProximo(null);
            return removido;
        } else {
            if (atual.getProximo() == null) {
                ultimo = anterior;
                ultimo.setProximo(null);
            } else {
                anterior.setProximo(atual.getProximo());
            }
        }

        removido.setProximo(null);
        return removido;

    }
    
    public Produto buscarProduto(int numero) {
        if (eVazia()) {
            return null;
        }

        Produto anterior = new Produto();
        Produto atual = new Produto();
        atual = primeiro;
        anterior = null;
        
        while (atual != null && atual.getCodigo() != numero) {
            anterior = atual;
            atual = atual.getProximo();
        }
        
        if (atual == null) {
            return null;
        }

        Produto removido = atual;
        return removido;

    }

    public void mostraLista() {
        Produto aux = primeiro;

        if (eVazia()) {
            System.out.println("Lista vazia!");
            return;
        }
        System.out.println("Elementos na lista: ");

        while (aux != null) {
            System.out.println(aux.getCodigo() + " - " + aux.getDescricao() + " - " + aux.getValor());
            aux = aux.getProximo();
        }

    }
    
    public String perguntar() {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("\nO que deseja fazer?");
        System.out.println("1 - Inserir");
        System.out.println("2 - Remover");
        System.out.println("3 - Alterar");
        System.out.println("4 - Mostrar a Lista");
        System.out.println("$ - Sair");

        return leia.next();
    }
    
    public boolean verificarCodigo(int codigo){
        if(eVazia())        
        return false;
        
        Produto aux = primeiro;
        
        while (aux != null) {
            
            if(codigo == aux.getCodigo()){
                return true;
            }
            aux = aux.getProximo();
        }
        
        return false;
    }
}
