package net.javacoureses.spb.kafka;

import net.javacoureses.spb.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final String TOPIC_NAME_JSON = "spb.learning-kafka-json";
    private static final String GROUP_ID = "consumer-group-api";
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = TOPIC_NAME_JSON, groupId = GROUP_ID)
    public void consume(User user){
        LOGGER.info(String.format("Json message received -> %s", user.toString()));
    }
}