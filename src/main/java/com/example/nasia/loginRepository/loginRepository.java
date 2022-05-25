package com.example.nasia.loginRepository;


import com.example.nasia.loginDomain.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface loginRepository extends JpaRepository<Login, Long> {
    Login findByUsernameAndPassword(String username,String password);
}
