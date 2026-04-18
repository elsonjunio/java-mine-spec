package io.mine.spec.dto.admin;

import java.time.Instant;

public record PolicyInfo(
    String policyName,
    Object policy,
    Instant createDate,
    Instant updateDate
) {}
