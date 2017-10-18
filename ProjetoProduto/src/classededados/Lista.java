///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package classededados;
//
///**
// *
// * @author selecta
// */
//public class Lista {
//
//    private Produto primeiro;
//    private Produto ultimo;
//
//    public Lista() {
//        primeiro = null;
//        ultimo = null;
//    }
//
//    public boolean eVazia() {
//        return primeiro == null;
//    }
//
//    public void insereInicio(No elemento) {
//        if (eVazia()) {
//            ultimo = elemento;
//        } else {
//            elemento.setProximo(primeiro);
//        }
//        primeiro = elemento;
//
//    }
//
//    public void insereFim(No elemento) {
//        if (eVazia()) {
//            insereInicio(elemento);
//        } else {
//            ultimo.setProximo(elemento);
//            ultimo = elemento;
//        }
//
//    }
//
////    public void insereOrdenado(int numero) {
////        if (eVazia()) {
////            insereInicio(new No(numero));
////        } else {
////            No atual = new No();
////            atual = primeiro;
////            No anterior = null;
////            No inserido = new No(numero);
////
////            while (atual != null && numero > atual.getNumero()) {
////                anterior = atual;
////                atual = atual.getProximo();
////            }
////
////            if (anterior == null) {
////                insereInicio(inserido);
////                return;
////            }
////
////            if (atual == null) {
////                insereFim(inserido);
////                return;
////            }
////
////            anterior.setProximo(inserido);
////            inserido.setProximo(atual);
////
////        }
////
////    }
//}
