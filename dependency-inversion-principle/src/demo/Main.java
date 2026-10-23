package demo;

public class Main {
    static void main() {
        Knight knight = new Knight();
        knight.setQuest(new GreatMatrimonyQuest());
        knight.goQuest();
    }
}
