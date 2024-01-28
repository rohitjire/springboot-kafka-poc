package com.deliveryboy.deliveryboy.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import static com.deliveryboy.deliveryboy.config.AppConstants.LOCATION_TOPIC_NAME;

@Configuration
public class KafkaConfig {

    public NewTopic topic(){
        return TopicBuilder
                .name(LOCATION_TOPIC_NAME)
                .build();
    }
}
