package dev.rinaldo.designpatterns.creational;

public class FactoryMethod_3 {

    // Produto -> ProdutoFactory
    // ProcessadorPagamento -> ProcessadorPagamentoFactory

    // Criador concreto com parâmetro
    // Produto Abstrato
    // Produto Concreto

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Categoria3 categoria3 = new Categoria3();
        Produto3 produto3 = categoria3.novoProduto(1);
    }

}

// Produto Abstrato
interface Produto3 {
}

// Produto Concreto
class ProdutoPadrao3 implements Produto3 {
}

// Produto Concreto
class ProdutoDigital3 extends ProdutoPadrao3 {
}

// Produto Concreto
class ProdutoFisico3 extends ProdutoPadrao3 {
}

// Criador concreto com parâmetro
class Categoria3 {
//    private String nome;
//    private Integer prioridade;

    // ...

    public Produto3 novoProduto(int tipoProduto) {
        switch (tipoProduto) {
            case 1:
                return new ProdutoPadrao3();
            case 2:
                return new ProdutoDigital3();
            case 3:
                return new ProdutoFisico3();
            default:
                throw new IllegalArgumentException();
        }
    }
}
