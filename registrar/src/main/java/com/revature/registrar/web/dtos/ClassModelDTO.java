package com.revature.registrar.web.dtos;

import com.revature.registrar.models.Faculty;
import com.revature.registrar.models.Student;
import com.revature.registrar.models.User;

import java.util.Calendar;
import java.util.Set;

public class ClassModelDTO {
    private int id;
    private String name;
    private int capacity;
    private String description;
    private Calendar openWindow;
    private Calendar closeWindow;

    private Set<UserDTO> students;
    private Set<UserDTO> faculty; //Could have multiple faculty members per class

}
