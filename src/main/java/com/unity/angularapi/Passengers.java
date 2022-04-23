package com.unity.angularapi;

import java.util.Date;
import java.util.List;

public class Passengers {

    private long id;
    private String fullName;
    private boolean checkedIn;
    private Date checkedInDate;
    private List<Children> children;

    public Passengers() {
    }

    public Passengers(long id, String fullName, boolean checkedIn, Date checkedInDate, List<Children> children) {
        this.id = id;
        this.fullName = fullName;
        this.checkedIn = checkedIn;
        this.checkedInDate = checkedInDate;
        this.children = children;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    public Date getCheckedInDate() {
        return checkedInDate;
    }

    public void setCheckedInDate(Date checkedInDate) {
        this.checkedInDate = checkedInDate;
    }

    public List<Children> getChildren() {
        return children;
    }

    public void setChildren(List<Children> children) {
        this.children = children;
    }
}
