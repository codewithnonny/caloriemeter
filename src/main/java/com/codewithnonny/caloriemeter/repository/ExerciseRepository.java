package com.codewithnonny.caloriemeter.repository;

import com.codewithnonny.caloriemeter.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface ExerciseRepository extends JpaRepository<Exercise,Long> {
    public Set<Exercise> findAllByUser_Id(Long id);
}
