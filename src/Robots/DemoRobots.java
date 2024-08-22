import java.util.LinkedList;

public class DemoRobots {
    public static void main(String args[]){
        RobotChef robC = new RobotChef("Робот-шев1", "РБ", 41, "передний");
        RobotSapper robS = new RobotSapper("Робот-сапер1", "шасси номер 3", 94, "аллюминий");
        RobotBuilder robB = new RobotBuilder("Робот-строиель1", "Китай", 87, "строительный агрегат 4", "пластик");

        LinkedList<Robots> exhib1 = new LinkedList<Robots>();
        exhib1.add(robC);
        exhib1.add(robS);
        exhib1.add(robB);

        LinkedList<RobotEngineer> exhib2 = new LinkedList<RobotEngineer>();
        exhib2.add(robS);
        exhib2.add(robB);

        LinkedList<RobotSapper> exhib3 = new LinkedList<RobotSapper>();
        exhib3.add(robS);

        for (Robots r:exhib1)
            r.uniquePossibility();

        for (RobotEngineer re:exhib2)
            re.showSpecialEngAbility();

        for (RobotSapper rs:exhib3)
            System.out.println(rs);
    }
}