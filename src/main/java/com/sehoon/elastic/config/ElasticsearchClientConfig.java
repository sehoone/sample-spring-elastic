package com.sehoon.elastic.config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.ClientConfiguration.TerminalClientConfigurationBuilder;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;

@Configuration
public class ElasticsearchClientConfig extends AbstractElasticsearchConfiguration {
    @Value("${spring.elasticsearch.uris}")
    private String uris;

    @Value("${spring.elasticsearch.username}")
    private String username;

    @Value("${spring.elasticsearch.password}")
    private String password;
    
  @Override
  @Bean
  public RestHighLevelClient elasticsearchClient() {
    TerminalClientConfigurationBuilder builder = ClientConfiguration.builder()
      .connectedTo(uris)
      .withBasicAuth(username, password); 
    final ClientConfiguration clientConfiguration = builder.build();
    return RestClients.create(clientConfiguration).rest();
  }
}
