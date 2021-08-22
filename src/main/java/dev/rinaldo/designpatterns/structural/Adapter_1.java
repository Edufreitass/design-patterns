package dev.rinaldo.designpatterns.structural;

import java.math.BigDecimal;

// Client
public class Adapter_1 {

    // Adapter (Wrapper)

    // Client — classe que utiliza o que foi implementado
    // Adapter — é a classe no qual faz a adaptação
    // Adaptee — é quem está sendo adaptado

    public static void main(String[] args) {
        MeuPagamentoCredito credito = new MeuPagamentoCredito();
        credito.debitar(new BigDecimal("100"));
    }

}

// Adapter
// voce tem acesso! é sua!
class MeuPagamentoCredito {

    SdkPagamentoCredito sdkPagamentoCredito = new SdkPagamentoCredito();

    public void debitar(BigDecimal valor) {
        sdkPagamentoCredito.autorizar(valor);
        sdkPagamentoCredito.capturar(valor);
    }

    public void creditar(BigDecimal valor) {
        sdkPagamentoCredito.creditar(valor);
    }

}

// Adaptee
// sdk fechada! voce não tem acesso!
class SdkPagamentoCredito {

    public void autorizar(BigDecimal valor) {
        // autoriza
    }

    public void capturar(BigDecimal valor) {
        // captura
    }

    public void creditar(BigDecimal valor) {
        // credita
    }
}
