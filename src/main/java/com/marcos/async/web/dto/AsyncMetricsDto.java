package com.marcos.async.web.dto;

public record AsyncMetricsDto(
    Integer requestsCount,
    Long durationInMilliseconds
) {}
