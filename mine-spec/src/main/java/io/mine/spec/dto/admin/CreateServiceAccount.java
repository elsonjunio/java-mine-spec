package io.mine.spec.dto.admin;

import java.time.Instant;

public record CreateServiceAccount(
    String status,
    String accessKey,
    String secretKey,
    Instant expiration
) {}
