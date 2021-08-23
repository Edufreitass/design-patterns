package dev.rinaldo.designpatterns.behavioral;

import java.math.BigDecimal;

public class Strategy_4 {

    // Estrategia — Interface
    // Estrategia — Concreta
    // Contexto

    public static void main(String[] args) {

        // List<Cliente> listaClientes
        // listaClientes.sort((c1, c2) -> c1.id > c2.id))

        BigDecimal valor = new BigDecimal("10");
        Compra4 compra = new Compra4(valor);

        compra.processarCompra(v -> System.out.println("Pagou no crédito " + v));
    }

}

class Compra4 {

    BigDecimal valor;

    public Compra4(BigDecimal valor) {
        this.valor = valor;
    }

    void processarCompra(EstrategiaPagamento4 estrategiaPagamento) {
        estrategiaPagamento.pagar(valor);
    }

}

interface EstrategiaPagamento4 {
    void pagar(BigDecimal valor);
}
