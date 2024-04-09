package com.ipApp;

import com.ipApp.persistence.model.User;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@IdClass(UserPk.class)
@Table(name="students")
public class Students {

    @Id
    @OneToOne
    private User id;

    private List<Assigment> assigments = new ArrayList<>();


    public static void get(){
        Students s = new Students();
        User u = new User();
    }

}
