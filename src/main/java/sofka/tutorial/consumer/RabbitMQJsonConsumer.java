package sofka.tutorial.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import sofka.tutorial.model.User;

@Service
public class RabbitMQJsonConsumer {

    //inicio de sesión como implementación de registrador
    // y el agregador Spring AMQP para enviar registros a
    // RabbitMQ sobre el protocolo AMQP.
    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQJsonConsumer.class);

    @RabbitListener(queues = {"${rabbitmq.queue.json.name}"})
    public void  consultJson(User user){
        LOGGER.info(String.format("Recieved Json message ->%s", user.toString()));
    }
}
