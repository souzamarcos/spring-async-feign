package com.marcos.async.web.dto;

import java.math.BigInteger;

public record AsyncMetricsDto(
    Integer requestsCount,
    BigInteger durationInMilliseconds
) {}
