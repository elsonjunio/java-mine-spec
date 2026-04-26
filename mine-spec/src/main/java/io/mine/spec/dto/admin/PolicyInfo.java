package io.mine.spec.dto.admin;

import java.time.Instant;

import com.fasterxml.jackson.databind.JsonNode;

public record PolicyInfo(
    String policyName,
    JsonNode policy,
    Instant createDate,
    Instant updateDate
) {}
