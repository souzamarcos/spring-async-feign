package com.marcos.async.web.impl;

import com.marcos.async.web.HealthController;
import com.marcos.async.web.dto.HealthDto;
import org.springframework.stereotype.Component;

@Component
public class DefaultHealthController implements HealthController {

    @Override
    public HealthDto health() {
        return new HealthDto(true);
    }
}
