package io.mine.spec.dto.admin;

public record BucketQuota(
    String bucket,
    String type,
    Long quotaBytes
) {}
