package dev.rinaldo.designpatterns.creational;

public class FactoryMethod_2 {

    // Criador Concreto
    // Produto Abstrato
    // Produto Concreto

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Categoria2 categoria2 = new Categoria2();
        Produto2 produto2 = categoria2.novoProduto();
    }

}

// Produto Abstrato
interface Produto2 {
}

// Produto Concreto
class ProdutoDigital2 implements Produto2 {
}

// Produto Concreto
class ProdutoFisico2 implements Produto2 {
}

// Criador Concreto
class Categoria2 {

//        private String nome;
//        private Tipo tipo;
//        private Integer prioridade;

    // FactoryMethod
    public Produto2 novoProduto() {
        // ...
        return new ProdutoFisico2();
    }
}

// Criador Concreto
class CategoriaDigital extends Categoria2 {
    // FactoryMethod
    public Produto2 novoProduto() {
        // ...
        return new ProdutoDigital2();
    }
}
