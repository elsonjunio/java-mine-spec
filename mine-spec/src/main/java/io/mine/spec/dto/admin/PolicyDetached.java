package io.mine.spec.dto.admin;

import java.util.List;

public record PolicyDetached(String user, List<String> policiesDetached) {}
