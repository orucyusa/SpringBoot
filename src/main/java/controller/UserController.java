package controller;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repo.UserRepo;

@RestController
@RequestMapping("/user")
//@CrossOrigin(origins="http://localhost:4200")
public class UserController {
    @Autowired
    private UserRepo repo;

    @PostMapping("/login")
    public ResponseEntity<User> loginUser(@RequestBody User userData){
        System.out.println(userData);
        User user= (User) repo.findByUserId(userData.getUserId());
        if(user.getPassword().equals(userData.getPassword()))
            return ResponseEntity.ok(user);

        return (ResponseEntity<User>) ResponseEntity.internalServerError();
    }

    @GetMapping
    public User getUser(){
        return repo.findAll().get(0);
    }
}
