package com.hdfc.employee.resttemplet;

import javax.net.ssl.SSLContext;

import org.apache.http.conn.ssl.NoopHostnameVerifier;

import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.conn.ssl.TrustAllStrategy;
import org.apache.http.impl.client.HttpClients;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
public class RestTemplateConfig {

    @Bean
    RestTemplate restTemplate() throws Exception {
        SSLContext sslContext = SSLContextBuilder.create()
                .loadTrustMaterial(TrustAllStrategy.INSTANCE)
                .build();
        HttpComponentsClientHttpRequestFactory requestFactory =
                new HttpComponentsClientHttpRequestFactory();
        requestFactory.setHttpClient(
                HttpClients.custom()
                        .setSSLHostnameVerifier(new NoopHostnameVerifier())
                        .setSSLContext(sslContext)
                        .build());
        return new RestTemplate(requestFactory);
    }
}
