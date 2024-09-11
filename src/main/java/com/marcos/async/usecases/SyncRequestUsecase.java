package com.marcos.async.usecases;

import com.marcos.async.gateway.HttpClient;
import com.marcos.async.service.RequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class SyncRequestUsecase {

    private final RequestService service;

    public Long execute(int times) {
        var startTime = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            service.getPage();
        }
        var endTime = System.currentTimeMillis();
        var durationInMilliseconds = endTime - startTime;
        return durationInMilliseconds;
    }
}
