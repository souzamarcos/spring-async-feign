package com.marcos.async.web;


import com.marcos.async.web.dto.AsyncMetricsDto;
import com.marcos.async.web.dto.HealthDto;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/async")
@Tag(name = "Async Test Controller", description = "Async test controller")
public interface AsyncTestController {

    @GetMapping("/request")
    AsyncMetricsDto makeRequests(@RequestParam("times") Integer times);

    @GetMapping("/virtual-threads/request")
    AsyncMetricsDto makeVirtualThreadsRequests(@RequestParam("times") Integer times);
}
