package dev.rinaldo.designpatterns.structural;

import java.math.BigDecimal;

// Client
public class Adapter_2 {

    // Client — classe que utiliza o que foi implementado
    // Adapter — é a classe no qual faz a adaptação
    // Adaptee — é quem está sendo adaptado
    // Target — é a implementação no qual está sendo feita

    public static void main(String[] args) {
        ProcessadorPagamento2 credito = new MeuPagamentoCredito2();
        credito.debitar(new BigDecimal("100"));
    }

}

// Target
interface ProcessadorPagamento2 {

    void debitar(BigDecimal valor);

    void creditar(BigDecimal valor);

}

// Adapter
class MeuPagamentoCredito2 implements ProcessadorPagamento2 {

    SdkPagamentoCredito2 sdkPagamentoCredito = new SdkPagamentoCredito2();

    @Override
    public void debitar(BigDecimal valor) {
        sdkPagamentoCredito.autorizar(valor);
        sdkPagamentoCredito.capturar(valor);
    }

    @Override
    public void creditar(BigDecimal valor) {
        sdkPagamentoCredito.creditar(valor);
    }
}

// Adaptee
// .jar / lib no maven
class SdkPagamentoCredito2 {

    // posso até ter acesso, mas não convém alterar

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