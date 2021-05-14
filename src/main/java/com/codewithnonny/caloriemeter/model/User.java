package com.codewithnonny.caloriemeter.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String username;
        private Double weight;
        private int age;


        @OneToMany(mappedBy = "user" , fetch = FetchType.EAGER, cascade = CascadeType.ALL)
        private Set<Exercise> exercise;

    public User() {
    }

    public User(Long id, String username, Double weight, int age, Set<Exercise> exercise) {
            this.id = id;
            this.username = username;
            this.weight = weight;
            this.age = age;
        }

    public Set<Exercise> getExercise() {
        return exercise;
    }

    public void setExercise(Set<Exercise> exercise) {
        this.exercise = exercise;
    }

    public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public Double getWeight() {
            return weight;
        }

        public void setWeight(Double weight) {
            this.weight = weight;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }


}
