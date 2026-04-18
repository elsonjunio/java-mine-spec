package io.mine.spec.dto.object;

import java.time.Instant;

public record ObjectVersion(
        String versionId,
        boolean isLatest,
        Instant lastModified,
        Long size) {
}
