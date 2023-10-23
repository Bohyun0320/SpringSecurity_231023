package com.bh.springsecurity_231023.Domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "role_nm")
    private String roleNm;

    @Builder
    public Role(Integer roleId, String roleNm) {
        this.roleId = roleId;
        this.roleNm = roleNm;
    }
}
