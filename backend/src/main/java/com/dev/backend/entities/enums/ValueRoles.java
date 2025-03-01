package com.dev.backend.entities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ValueRoles {
    ADMIN(1L),
    BASIC(2L);

    Long idRole;

}
