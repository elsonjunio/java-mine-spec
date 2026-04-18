package io.mine.spec.dto.object;

import java.time.Instant;


public record StorageObject(
    String key,
    Long size,
    Instant lastModified,
    String etag,
    String storageClass
) {}
