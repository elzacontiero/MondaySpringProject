package com.spartaglobal.mondayspringproject.controllers;
import com.spartaglobal.mondayspringproject.dto.KeyDTO;
import com.spartaglobal.mondayspringproject.entities.User;
import com.spartaglobal.mondayspringproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.UUID;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository repo;

    @PostMapping("springProject/api/user/login")
    public KeyDTO login(@RequestBody KeyDTO loginRequest) {


        List<User> response = repo.findByUserNameAndUserPassword(loginRequest.getUser(), loginRequest.getPassword());
        if (response.isEmpty()) {
            throw new UnauthorizedException();
        }

        User user = response.get(0);


        String key = UUID.randomUUID().toString();
        user.setUserKey(key);
        repo.save(user);


        loginRequest.setKey(key);
        loginRequest.setPassword(null); 
        return loginRequest;

    }

}
