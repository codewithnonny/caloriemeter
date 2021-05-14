package com.codewithnonny.caloriemeter.controller;

import com.codewithnonny.caloriemeter.model.Exercise;
import com.codewithnonny.caloriemeter.model.User;
import com.codewithnonny.caloriemeter.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/exercise")
public class ExerciseController {

    @Autowired
    private ExerciseService exerciseService;
    @Autowired
    private UserController userController;

    @PostMapping("/user/{id}")
    public Exercise addExercise (@RequestBody Exercise exercise,@PathVariable("id") Long id){

        User user =userController.getUser(id);
        exercise.setUser(user);
        return exerciseService.addExercise(exercise);

    }

    @GetMapping("{id}")
    public Set<Exercise> fetchById(@PathVariable Long id){
       Set<Exercise> e=exerciseService.getExerciseById(id);
        for(Exercise er:e){
            System.out.println(er.getUser().getUsername());
        }
        return e;
    }

    @DeleteMapping("{id}")
    public void removeExercise(@PathVariable("id") Long id){
        exerciseService.deleteExercise(id);
    }

    
    @PutMapping("{id}")
    public void updateExercise(@PathVariable("id") Long id,@RequestBody Exercise exercise){
        exerciseService.updateExercise(exercise,id);
    }

}
