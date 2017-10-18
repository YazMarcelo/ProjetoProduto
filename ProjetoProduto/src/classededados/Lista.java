/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classededados;

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
    
        public void mostraLista() {
        Produto aux = primeiro;

        if (eVazia()) {
            System.out.println("Lista vazia!");
            return;
        }
        System.out.println("Elementos na lista: ");

        while (aux != null) {
            System.out.println(aux.getCodigo() + " - " + aux.getDescricao()+" - "+aux.getValor());
            aux = aux.getProximo();
        }

    }
}
