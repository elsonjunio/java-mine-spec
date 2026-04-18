package io.mine.spec.dto.object;

import java.util.List;

public record ObjectVersionListResult(List<ObjectVersion> versions) 
{
    public ObjectVersionListResult {
        versions = List.copyOf(versions);
    }
}
