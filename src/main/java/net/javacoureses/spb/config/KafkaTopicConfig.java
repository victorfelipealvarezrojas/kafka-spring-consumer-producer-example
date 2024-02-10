package net.javacoureses.spb.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Value("${spring.kafka.topic.name}")
    private String TOPIC_NAME;
    private static final String TOPIC_NAME_JSON = "spb.learning-kafka-json";
    private static final int TOPIC_PARTITION = 3;
    private static final int TOPIC_REPLICAS = 3;

    @Bean
    public NewTopic selfTopic() {
        return TopicBuilder.name(TOPIC_NAME)
                .partitions(TOPIC_PARTITION)
                .replicas(TOPIC_REPLICAS)
                .build();
    }

    @Bean
    public NewTopic selfTopicJson() {
        return TopicBuilder.name(TOPIC_NAME_JSON)
                .partitions(TOPIC_PARTITION)
                .replicas(TOPIC_REPLICAS)
                .build();
    }
}
