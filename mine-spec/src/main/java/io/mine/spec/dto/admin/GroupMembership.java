package io.mine.spec.dto.admin;

import java.util.List;

public record GroupMembership(
    String name,
    List<String> policies
) {
    
    public GroupMembership {
        policies = List.copyOf(policies);
    }
}
