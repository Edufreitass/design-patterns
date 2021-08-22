package dev.rinaldo.designpatterns.structural;

import java.math.BigDecimal;

// Client
public class Adapter_3 {

    public static void main(String[] args) {
        MeuPagamentoCredito3 credito = new MeuPagamentoCredito3();
        credito.debitar(new BigDecimal("100"));
    }

}

// Target
interface ProcessadorPagamento3 {

    void debitar(BigDecimal valor);

    void creditar(BigDecimal valor);

}

// Adapter (Mão-dupla - dois sentidos - two-way)
class MeuPagamentoCredito3 extends SdkPagamentoCredito3 implements ProcessadorPagamento3 {

    public void debitar(BigDecimal valor) {
        super.autorizar(valor);
        super.capturar(valor);
    }

    public void creditar(BigDecimal valor) {
        super.creditar(valor);
    }
}

// Adaptee
class SdkPagamentoCredito3 {
    void autorizar(BigDecimal valor) {
        // autoriza
    }

    void capturar(BigDecimal valor) {
        // captura
    }

    void creditar(BigDecimal valor) {
        // credita
    }
}
