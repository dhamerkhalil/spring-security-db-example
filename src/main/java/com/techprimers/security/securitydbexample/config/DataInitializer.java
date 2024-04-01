package com.techprimers.security.securitydbexample.config;

import com.techprimers.security.securitydbexample.model.Role;
import com.techprimers.security.securitydbexample.model.Users;
import com.techprimers.security.securitydbexample.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class DataInitializer implements ApplicationRunner {

    private final UsersRepository userRepository;

    @Autowired
    public DataInitializer(UsersRepository usersRepository) {
        this.userRepository = usersRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // Initialize roles
        Role role1 = new Role();
        role1.setRole("ROLE_USER");

        Role role2 = new Role();
        role2.setRole("ROLE_ADMIN");

        // Initialize users
        Set<Role> roles1 = new HashSet<>();
        roles1.add(role1);

        Users user1 = new Users();
        user1.setEmail("user@example.com");
        user1.setPassword("password");
        user1.setName("User");
        user1.setLastName("One");
        user1.setActive(1);
        user1.setRoles(roles1);
        userRepository.save(user1);

        Set<Role> roles2 = new HashSet<>();
        roles2.add(role2);

        Users user2 = new Users();
        user2.setEmail("admin@example.com");
        user2.setPassword("root");
        user2.setName("root");
        user2.setLastName("User");
        user2.setActive(1);
        user2.setRoles(roles2);
        userRepository.save(user2);
    }
}
