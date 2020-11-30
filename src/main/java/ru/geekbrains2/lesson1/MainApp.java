package ru.geekbrains2.lesson1;

public class MainApp {
    public static void main(String[] args) {
        Abilities[] players = new Abilities[5];
        players[0] = new Cat("Кулек", 100, 0.5);
        players[1] = new Cat("Барсик", 105, 0.7);
        players[2] = new People("Валера", 5000, 2.0);
        players[3] = new People("Андрей", 900,1.0);
        players[4] = new Robot("Бендер", 10000,2.0);
        Obstacles[] obstacles = new Obstacles[5];
        obstacles[0] = new Track(50);
        obstacles[1] = new Track(100);
        obstacles[2] = new Wall(1.8);
        obstacles[3] = new Wall(1.0);
        obstacles[4] = new Track(1000);

        for (int i = 0; i < players.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                if (!(obstacles[j].isObstacle(players[i]))) {
                    if (players[i].getClass() == Cat.class) {
                        System.out.println(((Cat) players[i]).getName() + " выбыл на " + (j+1) + " препятствии");
                        break;
                    }
                    if (players[i].getClass() == People.class) {
                        System.out.println(((People)players[i]).getName() + " выбыл на " + (j+1) + " препятствии");
                        break;
                    }
                    if (players[i].getClass() == Robot.class) {
                        System.out.println(((Robot)players[i]).getName() + " выбыл на " + (j+1) + " препятствии");
                        break;
                    }
                }
            }
        }
    }
}


