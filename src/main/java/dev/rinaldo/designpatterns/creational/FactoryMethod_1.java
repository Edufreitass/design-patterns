package dev.rinaldo.designpatterns.creational;

public class FactoryMethod_1 {

    // Criador Abstrato
    // Produto Abstrato
    // Criador Concreto
    // Produto Concreto

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Categoria categoria = new Digital();
        Produto produto = categoria.novoProduto();
    }

}

// Produto Abstrato
interface Produto {
}

// Produto Concreto
class ProdutoDigital implements Produto {
}

// Produto Concreto
class ProdutoFisico implements Produto {
}

// Criador Abstrato
interface Categoria {
    // FactoryMethod
    Produto novoProduto();
}

// Criador Concreto
class Digital implements Categoria {

    // FactoryMethod
    @Override
    public Produto novoProduto() {
        // ...
        return new ProdutoDigital();
    }
}

// Criador Concreto
class Fisico implements Categoria {

    // FactoryMethod
    @Override
    public Produto novoProduto() {
        // ...
        return new ProdutoFisico();
    }
}