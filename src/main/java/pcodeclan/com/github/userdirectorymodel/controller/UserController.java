package pcodeclan.com.github.userdirectorymodel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pcodeclan.com.github.userdirectorymodel.models.User;
import pcodeclan.com.github.userdirectorymodel.repository.UserRespository;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRespository userRespository;

    @GetMapping(value = "/users")
    public ResponseEntity<List<User>> getAllUsers(){
        return new ResponseEntity<>(userRespository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/user/{id}")
    public ResponseEntity getOneUser(@PathVariable Long id){
        return new ResponseEntity<>(userRespository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/users")
    public ResponseEntity<User> postUser(@RequestBody User user){
        userRespository.save(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }
}
