package com.hansheng.sprintbootregisterlogin.appuser;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AppUserRepository {
    Optional<AppUser> findByEmail(String email);
}
