package com.example;

import java.util.Date;
import java.util.List;

public class Phase {
    private String code;
    private String title;
    private String description;
    private Date start;
    private Date end;
    private boolean progressState;
    private boolean billingState;
    private boolean paymentState;
    private List<Employee> employees;
}
