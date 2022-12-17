public class Main {
    public static void main(String[] args) {
        Human maksim = new Human(1988, "Максим", "Минск", "бренд-менеджер");
        Human anna = new Human(1993, "Аня", "Москва", "методист образовательных программ");
        Human kate = new Human(1992, "Катя", "Калининград", "продакт-менеджер");
        Human artem = new Human(1995, "Артем", "Москва", "директор по развитию бизнеса");
        Human vladimir = new Human(2001, "Владимир", "Казань", null);

        System.out.println(maksim);
        System.out.println(anna);
        System.out.println(kate);
        System.out.println(artem);
        System.out.println(vladimir);
    }
}