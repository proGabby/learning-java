package com.partyapp.java;

import com.partyapp.java.Participant;

import tip.partyapp.java.*;

public class main {

    public static void main(String[] args) {

        Participant firstpartic = new Participant("joy", "female");
        SecurityMan firstSecurity = new SecurityMan("Maxwell", "Black", "black", true, true);

        firstSecurity.searchParticipant(firstpartic);

        if (firstpartic.getCanEnter()) {
            firstpartic.dance(3);
        }

    }
}
