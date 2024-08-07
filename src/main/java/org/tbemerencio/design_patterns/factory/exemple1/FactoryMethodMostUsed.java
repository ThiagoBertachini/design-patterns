package org.tbemerencio.design_patterns.factory.exemple1;
// criacional
public class FactoryMethodMostUsed {
    // Criador concreto
    // Produto abstrato
    // Produto concreto

    public static void main(String[] args) {
        Categoria3 categoria3 = new Categoria3();
        Produto3 produto3 = categoria3.novoProduto(1);
        System.out.println(produto3.venderProduto());
    }
}

interface Produto3 {
    int venderProduto();
}

class ProdutoPadrao3 implements Produto3{
    private String tipo;

    ProdutoPadrao3(String tipo){ this.tipo = tipo;}

    public String getTipo(){ return tipo;}

    @Override
    public int venderProduto() {
        return 0;
    }
}

class ProdutoDigital3 extends ProdutoPadrao3{
    ProdutoDigital3(String tipo) {
        super(tipo);
    }

    @Override
    public int venderProduto() {
        return 1;
    }
}

class ProdutoFisico3 extends ProdutoPadrao3{
    ProdutoFisico3(String tipo) {
        super(tipo);
    }
}

class Categoria3{
    Produto3 novoProduto(int produto){
        return switch (produto) {
            case 1 -> new ProdutoDigital3("e-book");
            case 2 -> new ProdutoFisico3("computer");
            default -> new ProdutoPadrao3("default");
        };
    }
}
