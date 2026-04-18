package io.mine.spec.dto.admin;

import java.util.List;

public record User(String accessKey, String status, List<GroupMembership> memberOf) {
    public User {
        memberOf = List.copyOf(memberOf);
    }
}
