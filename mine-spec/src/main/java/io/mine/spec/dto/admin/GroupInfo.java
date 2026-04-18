package io.mine.spec.dto.admin;

import java.util.List;

public record GroupInfo(String groupName,
    String status,
    List<String> members
) {
    public GroupInfo{
        members = List.copyOf(members);
    }

}
