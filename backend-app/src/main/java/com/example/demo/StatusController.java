package com.example.demo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
@Tag(
    name = "Estado de Infraestructura",
    description = "Endpoints para validar conectividad entre capas"
)
public class StatusController {

    @GetMapping("/status")
    @Operation(
        summary = "Verificar estado del Backend",
        description = "Retorna confirmación de operatividad de la API"
    )
    public Map<String, String> getStatus() {

        Map<String, String> response = new HashMap<>();

        response.put("status", "OK");
        response.put(
            "message",
            "Conexión exitosa con el Backend Spring Boot"
        );

        return response;
    }
}
