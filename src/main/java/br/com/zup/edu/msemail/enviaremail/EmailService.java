package br.com.zup.edu.msemail.enviaremail;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private final Logger LOGGER = LoggerFactory.getLogger(EmailService.class);

    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void enviaEmail(TransacaoMessage transacaoMessage) {
        LOGGER.info("" +
                "Enviando email..." +
                "Tipo de operação: {}," +
                "Valor: {}," +
                "feitaEm: {}," +
                "Cliente: {}," +
                "Numero de conta: {}", transacaoMessage.getOperacao(), transacaoMessage.getValor(), transacaoMessage.getFeitaEm(),
                transacaoMessage.getClienteId(), transacaoMessage.getConta());
    }
}
