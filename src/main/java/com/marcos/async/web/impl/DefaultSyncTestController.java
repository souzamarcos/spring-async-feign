package com.marcos.async.web.impl;

import com.marcos.async.usecases.SyncRequestUsecase;
import com.marcos.async.web.SyncTestController;
import com.marcos.async.web.dto.AsyncMetricsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class DefaultSyncTestController implements SyncTestController {

    private final SyncRequestUsecase syncRequestUsecase;

    @Override
    public AsyncMetricsDto makeRequests(Integer times) {
        var durationInMilliseconds = syncRequestUsecase.execute(times);

        return new AsyncMetricsDto(times, durationInMilliseconds);
    }
}
