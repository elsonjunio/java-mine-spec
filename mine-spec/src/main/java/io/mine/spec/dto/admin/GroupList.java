package io.mine.spec.dto.admin;

import java.util.List;

public record GroupList(
    List<String> groups
) {
    public GroupList{
        groups = List.copyOf(groups);
    }
}
