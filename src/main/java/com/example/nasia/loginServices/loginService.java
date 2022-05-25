package com.example.nasia.loginServices;

import com.example.nasia.loginDomain.Login;
import com.example.nasia.loginRepository.loginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class loginService {

    @Autowired

    private loginRepository repo;

  public Login login(String username, String password) {
      Login user = repo.findByUsernameAndPassword(username,password);

      return user;
  }
}
