package com.marcos.async.web.impl;

import com.marcos.async.usecases.AsyncRequestUsecase;
import com.marcos.async.web.AsyncTestController;
import com.marcos.async.web.dto.AsyncMetricsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class DefaultAsyncTestController implements AsyncTestController {

    private final AsyncRequestUsecase asyncRequestUsecase;
    @Override
    public AsyncMetricsDto makeRequests(Integer times) {
        var durationInMilliseconds = asyncRequestUsecase.execute(times);

        return new AsyncMetricsDto(times, durationInMilliseconds);
    }
}
