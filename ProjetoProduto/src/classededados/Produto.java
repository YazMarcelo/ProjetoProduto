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
public class Produto {
    private int codigo = 0;
    private String descricao = "";
    private double valor = 0;
    private Produto proximo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Produto getProximo() {
        return proximo;
    }

    public void setProximo(Produto proximo) {
        this.proximo = proximo;
    }
    
        
}
