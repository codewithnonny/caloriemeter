package com.codewithnonny.caloriemeter.service;

import com.codewithnonny.caloriemeter.model.Exercise;

import java.util.Set;


public interface ExerciseService {
    public Exercise addExercise( Exercise exercise);
    public Set<Exercise> getExerciseById(Long id);

    public void deleteExercise(Long id);

    public void updateExercise(Exercise exercise, Long id);
}
