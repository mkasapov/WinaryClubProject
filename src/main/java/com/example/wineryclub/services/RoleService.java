package com.example.wineryclub.services;

import com.example.wineryclub.domain.models.service.RoleServiceModel;


import java.util.Set;

public interface RoleService {

    void seedRolesInDb();
    Set<RoleServiceModel> findAllRoles();
    RoleServiceModel findByAuthority(String authority);

}
