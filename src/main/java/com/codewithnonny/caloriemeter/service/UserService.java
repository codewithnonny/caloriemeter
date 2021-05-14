package com.codewithnonny.caloriemeter.service;

import com.codewithnonny.caloriemeter.model.User;



public interface UserService {

    public User createUser(User user);

    public void deleteProfile(Long id);

    public void updateProfile(User user,Long id);

    public User getUserById(Long id);
}
