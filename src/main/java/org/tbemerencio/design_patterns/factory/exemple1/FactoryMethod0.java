package org.tbemerencio.design_patterns.factory.exemple1;
// criacional
public class FactoryMethod0 {
    public static void main(String[] args) {

        Categoria2 categoria2 = new Categoria2();
        Categoria2 catDig = new CategoriaDigital();
        Produto2 produto2 = categoria2.novoProduto();
        Produto2 prodDig = catDig.novoProduto();
    }
}

interface Produto2 {
}

class ProdutoDigital2 implements Produto2 {}

class ProdutoFisico2 implements Produto2{}

class Categoria2 {
    public Produto2 novoProduto(){
        return new ProdutoFisico2();
    }
}

class CategoriaDigital extends Categoria2{
    public Produto2 novoProduto(){
        return new ProdutoDigital2();
    }
}