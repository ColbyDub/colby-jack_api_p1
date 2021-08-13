package com.revature.registrar.web.dtos;

import com.revature.registrar.models.ClassModel;
import com.revature.registrar.models.Student;
import com.revature.registrar.models.User;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class StudentDTO extends UserDTO {
    private Set<ClassModelDTO> classes = new HashSet<>();

    public StudentDTO(Student subject) {
        super(subject);

    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + this.getId() +
                ", firstName='" + this.getFirstName() + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                ", email='" + this.getEmail() + '\'' +
                ", username='" + this.getUsername() + '\'' +
                ", isFaculty=" + "false" +
                '}';
    }
}
