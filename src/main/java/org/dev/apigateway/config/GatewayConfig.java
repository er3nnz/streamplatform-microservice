package org.dev.apigateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("movie-catalog-service", r -> r.path("/movie-info/**")
                        .uri("http://localhost:8090"))
                .route("movie-streaming-service", r -> r.path("/stream/**")
                        .uri("http://localhost:8091"))
                .build();
    }
}
