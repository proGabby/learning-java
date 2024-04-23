package inheritance_java;

class Party {

    String venue = "St Mbaki VIP Lodget";

    public void allowParticipateEnter() {
        System.out.println("you can enter");
    }

    public void searchParticipateforHarmfulObject() {
        System.out.println("we are searching you for harmful objects and drugs");
    }

    public void giveParticipateDrink() {
        System.out.println("Take a drink");
    }
   
}

class DinnerParty extends Party {

}

class PartyDemostration {

    public static void main(String[] args) {
        Party nightParty = new DinnerParty();
        nightParty.searchParticipateforHarmfulObject();
        nightParty.allowParticipateEnter();
        nightParty.giveParticipateDrink();
    }
}
