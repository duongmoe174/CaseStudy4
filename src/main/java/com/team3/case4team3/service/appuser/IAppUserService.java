package com.team3.case4team3.service.appuser;


import com.team3.case4team3.model.AppUser;
import com.team3.case4team3.service.IGeneralService;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IAppUserService extends IGeneralService<AppUser>, UserDetailsService {
    AppUser findByName(String name);
}
