package com.partyapp.java;

public class Participant {
    final String name;
    final String gender;
    protected boolean canEnter;

    public boolean getCanEnter() {
        // securiymen or not
        return canEnter;
    }

    public void setCanEnter() {
        // only security man can access.
        canEnter = true;
    }

    public Participant(String celebrantName, String gender) {
        this.name = celebrantName;
        this.gender = gender;
        this.canEnter = false;
    }

    void dance(int numberOfTimes) {
        System.out.println(this.name + " is dancing");

    }

    public void stopEntry() {
        System.out.println("i can't enter the event hall");
    }
}
