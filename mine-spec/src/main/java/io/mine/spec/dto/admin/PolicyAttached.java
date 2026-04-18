package io.mine.spec.dto.admin;

import java.util.List;

public record PolicyAttached(String user, List<String> policiesAttached) {}
