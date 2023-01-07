package com.epam.mjc;

public class StudentNotFindException extends IllegalArgumentException {
    StudentNotFindException(String id) {
        super(String.format("Could not find student with ID %s", id));
    }
}
