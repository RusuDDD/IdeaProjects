package de.telran;

import java.util.List;

public class Student {
    private String name;
    private List<Integer>scores;

    public Student(String name, List<Integer> scores) {
        this.name = name;
        this.scores = scores;

    }

    @Override
    public String toString() {
        return name + " " + scores;
    };
}
