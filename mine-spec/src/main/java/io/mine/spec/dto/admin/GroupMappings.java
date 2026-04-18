package io.mine.spec.dto.admin;

import java.util.List;

public record GroupMappings(
    String group,
    List<String> policies
) {
    public GroupMappings{
       policies = List.copyOf(policies); 
    }
}
