package io.mine.spec.dto.admin;

import java.util.List;

public record GroupPolicyAttached(
    String group,
    List<String> policiesAttached
) {
    public GroupPolicyAttached {
        policiesAttached = List.copyOf(policiesAttached);
    }
}
