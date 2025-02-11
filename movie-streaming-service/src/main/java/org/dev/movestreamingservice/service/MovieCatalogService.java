package org.dev.movestreamingservice.service;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MovieCatalogService {

    private final RestTemplate restTemplate;
    public static final String CATALOG_SERVICE = "http://movie-catalog-service";

    public MovieCatalogService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getMoviePath(Long movieInfoId) {
        var response = restTemplate.getForEntity(CATALOG_SERVICE + "/movie-info/find-path-by-id/{movieInfoId}", String.class, movieInfoId);
        return response.getBody();
    }
}
