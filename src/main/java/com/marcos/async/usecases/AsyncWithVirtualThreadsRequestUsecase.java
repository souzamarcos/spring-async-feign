package com.marcos.async.usecases;

import com.marcos.async.service.RequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@RequiredArgsConstructor
@Component
public class AsyncWithVirtualThreadsRequestUsecase {


    private final RequestService service;


    public Long execute(int times) {
        var startTime = System.currentTimeMillis();
        List<CompletableFuture<String>> responses = new ArrayList<>();
        for (int i = 0; i < times; i++) {
            responses.add(service.getPageAsyncWithVirtualThreads());
        }
        responses.forEach(CompletableFuture::join);
        var endTime = System.currentTimeMillis();
        var durationInMilliseconds = endTime - startTime;
        return durationInMilliseconds;
    }
}
