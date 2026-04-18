package io.mine.spec.dto.admin;

import java.time.Instant;
import java.util.List;


public record ResultGroupMappings(
    Instant timestamp, List<GroupMappings> groupMappings
) {}
