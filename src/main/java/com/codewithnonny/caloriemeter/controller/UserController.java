package com.codewithnonny.caloriemeter.controller;


import com.codewithnonny.caloriemeter.model.Exercise;
import com.codewithnonny.caloriemeter.model.User;
import com.codewithnonny.caloriemeter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/user/")
public class UserController {
        @Autowired
        private UserService userService;

        @PostMapping("register")
        public User saveUser(@RequestBody User user){
           User user1 = userService.createUser(user);
           return user1;
        }

        @GetMapping("{id}")
        public User getUser(@PathVariable("id") Long id){
            User u1 =userService.getUserById(id);
            return u1;
        }

        @GetMapping("index")
        public String indexPage(){
            return "index";
        }

        @DeleteMapping("{id}")
        public void removeProfile(@PathVariable("id") Long id){
            userService.deleteProfile(id);
        }

        @PutMapping("{id}")
        public void updateProfile(@PathVariable("id") Long id, @RequestBody User user){
            userService.updateProfile(user,id);
        }

}