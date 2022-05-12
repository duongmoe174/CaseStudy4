package com.team3.case4team3.service.approle;


import com.team3.case4team3.model.AppRole;
import com.team3.case4team3.service.IGeneralService;

public interface IAppRoleService extends IGeneralService<AppRole> {
    AppRole findByName(String name);
}
