package dev.rinaldo.designpatterns.behavioral;

import java.math.BigDecimal;

public class Strategy_1 {

    // Estrategia — Interface
    // Estrategia — Concreta
    // Contexto

    public static void main(String[] args) {
        BigDecimal valor = new BigDecimal("10");
        Compra compra = new Compra(valor);

        compra.processarCompra(new PagamentoCartaoCredito());
//        compra.processarCompra(new PagamentoCartaoDebito());
    }

}

// Contexto
class Compra {

    BigDecimal valor;

    public Compra(BigDecimal valor) {
        this.valor = valor;
    }

    public void processarCompra(EstrategiaPagamento estrategiaPagamento) {
        estrategiaPagamento.pagar(valor);
    }
}

// PagamentoStrategy
// Estrategia — Interface
interface EstrategiaPagamento {

    void pagar(BigDecimal valor);

}

// Estrategia — Concreta
class PagamentoCartaoCredito implements EstrategiaPagamento {

    @Override
    public void pagar(BigDecimal valor) {
        System.out.println("Pagou no crédito " + valor);
    }
}

// Estrategia — Concreta
class PagamentoCartaoDebito implements EstrategiaPagamento {

    @Override
    public void pagar(BigDecimal valor) {
        System.out.println("Pagou no débito " + valor);
    }
}