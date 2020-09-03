public class Game {

    public void play() {
        System.out.println("====== BullsAndCows ======");
        Gamer gamer = new Gamer();
        Computer computer = new Computer();
        Rule rule = new Rule();

        rule.getScore(computer.getNumbers(), gamer.getNumbers());
        System.out.println(rule.toString());
    }
}
