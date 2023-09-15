package com.example;

import java.util.Date;
import java.util.List;

public class Project {
    private String code;
    private String name;
    private String description;
    private Date start;
    private Date end;
    private float amount;
    private ProjectStats status;
    private Chef chef;
    private List<Phase> phases;
}