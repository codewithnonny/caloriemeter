package com.codewithnonny.caloriemeter.service.impl;

import com.codewithnonny.caloriemeter.model.User;
import com.codewithnonny.caloriemeter.repository.ExerciseRepository;
import com.codewithnonny.caloriemeter.repository.UserRepository;
import com.codewithnonny.caloriemeter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    private ExerciseRepository exerciseRepository;

    @Override
    public User createUser(User user) {
        return  userRepository.save(user);
    }

    @Override
    public void deleteProfile(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void updateProfile(User user,Long id) {
        if (id == user.getId()){
            userRepository.save(user);
        }
    }

    @Override
    public User getUserById(Long id) {
       return userRepository.getOne(id);
    }


}
