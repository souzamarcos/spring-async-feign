package com.marcos.async.web.impl;

import com.marcos.async.web.AsyncTestController;
import com.marcos.async.web.dto.AsyncMetricsDto;
import com.marcos.async.web.dto.HealthDto;
import org.springframework.stereotype.Component;

import java.math.BigInteger;

@Component
public class DefaultAsyncTestController implements AsyncTestController {

    @Override
    public AsyncMetricsDto blocking() {
        return new AsyncMetricsDto(0, BigInteger.ZERO);
    }
}
