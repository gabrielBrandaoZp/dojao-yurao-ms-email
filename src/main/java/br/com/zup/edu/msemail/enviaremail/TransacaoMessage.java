package br.com.zup.edu.msemail.enviaremail;

import java.math.BigDecimal;

public class TransacaoMessage {

    private String operacao;
    private BigDecimal valor;
    private String feitaEm;
    private Long clienteId;
    private Long conta;

    public String getOperacao() {
        return operacao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public String getFeitaEm() {
        return feitaEm;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public Long getConta() {
        return conta;
    }
}
