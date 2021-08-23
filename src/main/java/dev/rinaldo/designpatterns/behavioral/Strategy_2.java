package dev.rinaldo.designpatterns.behavioral;

import java.math.BigDecimal;

public class Strategy_2 {

    // Estrategia — Interface
    // Estrategia — Concreta
    // Contexto

    public static void main(String[] args) {
        BigDecimal valor = new BigDecimal("10");
        Compra2 compra = new Compra2(valor);

        compra.processarCompra(new PagamentoCartaoCredito2());
//        compra.processarCompra(new PagamentoCartaoDebito2());
    }

}

// Contexto
class Compra2 {

    // Long id;
    BigDecimal valor;
    // Tipo tipo;

    public Compra2(BigDecimal valor) {
        this.valor = valor;
    }

    public void processarCompra(EstrategiaPagamento2 estrategiaPagamento) {
        estrategiaPagamento.pagar(this);
    }
}

// PagamentoStrategy
// Estrategia — Interface
interface EstrategiaPagamento2 {

    void pagar(Compra2 compra);

}

// Estrategia — Concreta
class PagamentoCartaoCredito2 implements EstrategiaPagamento2 {

    @Override
    public void pagar(Compra2 compra) {
        System.out.println("Pagou no crédito " + compra.valor);
        // compra.set...
    }
}

// Estrategia — Concreta
class PagamentoCartaoDebito2 implements EstrategiaPagamento2 {

    @Override
    public void pagar(Compra2 compra) {
        System.out.println("Pagou no débito " + compra.valor);
    }
}
