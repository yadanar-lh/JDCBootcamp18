package demo;

public class Knight {

    //all has-a relationships have dependency //quest is a dependency of quest
//    private RescuingPrincessQuest quest = new RescuingPrincessQuest();
    private Quest quest;

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    public void goQuest(){
        quest.goQuest();
    }
}
