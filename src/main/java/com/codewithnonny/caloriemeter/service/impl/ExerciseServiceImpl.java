package com.codewithnonny.caloriemeter.service.impl;

import com.codewithnonny.caloriemeter.model.Exercise;
import com.codewithnonny.caloriemeter.repository.ExerciseRepository;
import com.codewithnonny.caloriemeter.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ExerciseServiceImpl implements ExerciseService {
    @Autowired
    private ExerciseRepository exerciseRepository;


    @Override
    public Exercise addExercise(Exercise exercise) {
        return exerciseRepository.save(exercise);
    }

    @Override
    public Set<Exercise> getExerciseById(Long id) {
        return exerciseRepository.findAllByUser_Id(id);
    }

    @Override
    public void deleteExercise(Long id) {
        exerciseRepository.deleteById(id);
    }

    @Override
    public void updateExercise(Exercise exercise, Long id) {
        if (id == exercise.getId()){
            exerciseRepository.save(exercise);
        }
    }
}
