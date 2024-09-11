package com.marcos.async.web;


import com.marcos.async.web.dto.AsyncMetricsDto;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sync")
@Tag(name = "Sync Test Controller", description = "Sync test controller")
public interface SyncTestController {

    @GetMapping("/request")
    AsyncMetricsDto makeRequests(@RequestParam("times") Integer times);
}
