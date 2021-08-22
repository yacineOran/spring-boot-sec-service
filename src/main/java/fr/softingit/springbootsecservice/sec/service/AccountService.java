package fr.softingit.springbootsecservice.sec.service;

import fr.softingit.springbootsecservice.sec.entities.AppRole;
import fr.softingit.springbootsecservice.sec.entities.AppUser;

import java.util.List;

public interface AccountService {

    AppUser addNewUser(AppUser appUser);
    AppRole addNewRole(AppRole appRole);
    void addRoleToUser(String userName, String roleName);
    AppUser loadUserByUserName(String userName);
    List<AppUser> listUsers();
}
