package io.mine.spec.dto.object;

import java.time.Instant;
import java.util.Map;

public record ObjectMetadata(
    Long size,
    String etag,
    Instant lastModified,
    String contentType,
    Map<String, String> metadata
) {
    public ObjectMetadata {
        metadata = Map.copyOf(metadata);
    }

}