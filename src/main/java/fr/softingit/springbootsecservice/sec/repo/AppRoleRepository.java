package fr.softingit.springbootsecservice.sec.repo;

import fr.softingit.springbootsecservice.sec.entities.AppRole;
import fr.softingit.springbootsecservice.sec.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole, Long> {

    AppRole findByRoleName(String roleName);
}
