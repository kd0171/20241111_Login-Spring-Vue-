package com.example.backend.service;

import org.springframework.stereotype.Service;
import com.example.backend.entity.UserEntity;
import java.util.Optional;

@Service
public class UserService {
    private static final String EXISTING_EMAIL = "test@test.com"; 
    private static final String ANOTHER_EMAIL = "next@test.com"; 
    public Optional<UserEntity> findByEmail(String email){
        //ToDo move this to Database
        if (EXISTING_EMAIL.equalsIgnoreCase(email)) {
            var user = new UserEntity();
            user.setId(1L);
            user.setEmail(EXISTING_EMAIL);
            user.setPassword("$2a$12$OBnerD3ZrnkqY/ofkaxune1jnpUscFhTGCcuVA9x5lgAGAtr6Bss2"); // test
            user.setRole("ROLE_ADMIN");
            user.setExtraInfo("My nice admin user");
            return Optional.of(user);
        } else if (ANOTHER_EMAIL.equalsIgnoreCase(email)) {
            var user = new UserEntity();
            user.setId(2L);
            user.setEmail(ANOTHER_EMAIL);
            user.setPassword("$2a$12$OBnerD3ZrnkqY/ofkaxune1jnpUscFhTGCcuVA9x5lgAGAtr6Bss2"); // test
            user.setRole("ROLE_USER");
            user.setExtraInfo("My nice simple user");
            return Optional.of(user);
        } else {
            return Optional.empty();
        }
    }
}