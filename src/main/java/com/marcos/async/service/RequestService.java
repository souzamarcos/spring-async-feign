package com.marcos.async.service;

import com.marcos.async.gateway.HttpClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

@RequiredArgsConstructor
@Slf4j
@Component
public class RequestService {

    private final HttpClient httpClient;

    @Async("defaultTaskExecutor")
    public CompletableFuture<String> getPageAsync() {
        log.info("getPageAsync");
        return CompletableFuture.completedFuture(httpClient.getPage());
    }

    @Async("virtualTaskExecutor")
    public CompletableFuture<String> getPageAsyncWithVirtualThreads() {
        log.info("getPageAsync");
        return CompletableFuture.completedFuture(httpClient.getPage());
    }

    public String getPage() {
        log.info("getPage");
        return httpClient.getPage();
    }
}
