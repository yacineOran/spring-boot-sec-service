package fr.softingit.springbootsecservice.sec.repo;

import fr.softingit.springbootsecservice.sec.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {

    AppUser findByUserName(String userName);
}
