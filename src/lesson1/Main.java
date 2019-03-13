package lesson1;

public class Main {
    public static void main(String[] args) {

        Team team = new Team("Комарики", new Cat("Дворовая", "Милка"),new Dog("Терис", "Ротвеллер" ,700, 10, 10), new Cat("Сиамская", "Няшка"),new Dog("Филька", "Дворняга", 100,  20, 30));
        Obstacle[] obstacles = {new Cross(70), new Wall(2), new Wall(1),new Water(2)};
        Course course = new Course(obstacles);
        course.doIt(team);
        team.showWinners();

    }
}
