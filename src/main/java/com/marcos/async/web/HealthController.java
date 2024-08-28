package com.marcos.async.web;


import com.marcos.async.web.dto.HealthDto;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
@Tag(name = "Health", description = "Health check request")
public interface HealthController {

    @GetMapping
    HealthDto health();
}
