package com.davidbarroso.literalura.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ConsumoAPI {
    public String obterDadosLivros (String apiUrl){

        // Criando o cliente HTTP
        HttpClient cliente = HttpClient.newHttpClient();

        // Construindo a solicitação
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl))
                .GET()
                .build();

        //Enviando a solicitação e obtendo a resposta
        HttpResponse<String> response;
        try {
            response = cliente.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        return response.body();
    }
}

