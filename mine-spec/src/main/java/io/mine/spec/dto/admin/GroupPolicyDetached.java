package io.mine.spec.dto.admin;

import java.util.List;


public record GroupPolicyDetached(
    String group,
    List<String> policiesDetached 
) {
    public GroupPolicyDetached {
        policiesDetached = List.copyOf(policiesDetached);
    }
}
