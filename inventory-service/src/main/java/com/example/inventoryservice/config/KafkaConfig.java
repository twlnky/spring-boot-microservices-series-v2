/***
<p>
    Licensed under MIT License Copyright (c) 2026 Raja Kolli.
</p>
***/

package com.example.inventoryservice.config;

import static com.example.inventoryservice.utils.AppConstants.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;

@Configuration(proxyBeanMethods = false)
@EnableKafka
class KafkaConfig {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Bean
    KafkaAdmin.NewTopics topics() {
        log.info(
                "Inside creating topics :{}, {}, {}, {}, {}",
                ORDERS_TOPIC,
                STOCK_ORDERS_TOPIC,
                STOCK_ORDERS_TOPIC,
                PRODUCT_TOPIC,
                LOW_STOCK_ALERTS_TOPIC);
        // streams needs topics to be created beforehand, so instead of delegating to kafkaAdmin to
        // create, manually creating
        return new KafkaAdmin.NewTopics(
                TopicBuilder.name(ORDERS_TOPIC).build(),
                TopicBuilder.name(STOCK_ORDERS_TOPIC).build(),
                TopicBuilder.name(PRODUCT_TOPIC).build(),
                TopicBuilder.name(LOW_STOCK_ALERTS_TOPIC).replicas(1).partitions(1).build());
    }
}
