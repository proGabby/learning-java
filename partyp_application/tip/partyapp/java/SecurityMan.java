
package tip.partyapp.java;

import com.partyapp.java.Participant;

public class SecurityMan {
    final String name;
    final String glassColor;
    final String uniformColor;
    final boolean isHoldingGun;
    final boolean haveBoot;
    final boolean hasTalkingWalking;

    public SecurityMan(String inputName, String inpGlassColor, String uniColor, boolean hasGun, boolean hasBoot) {
        this.name = inputName;
        this.glassColor = inpGlassColor;
        this.uniformColor = uniColor;
        this.isHoldingGun = hasGun;
        this.haveBoot = hasBoot;
        this.hasTalkingWalking = true;
    }

    void shortGun() {
        System.out.println("I have shot my gun");

    }

    void searchDubiousParticipant(Participant participant) {
        System.out.println("I am searching you");
        participant.stopEntry();
    }

    public void searchParticipant(Participant participant) {
        System.out.println("I am searching you");
        participant.setCanEnter();
    }
}
