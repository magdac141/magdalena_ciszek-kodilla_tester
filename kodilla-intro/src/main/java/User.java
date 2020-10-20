public class User
{
    String name;
    int age;

    public static void main(String[] args) {
        double srednia = 0;
        double suma = 0;
        User anna = new User("Anna", 20);
        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);
        User[] users = {anna, betty, carl, david, eva, frankie};
        System.out.println("Ilość osób : " + users.length);
        for(int i=0; i<users.length; i++){
            suma = suma + users[i].age;
        }
        srednia = suma / users.length;
        System.out.printf("Średnia wieku wynosi : %.2f\n", srednia);
        for(int i=0; i<users.length; i++){
            if (users[i].age < srednia)
                System.out.println("Osoba z wiekiem poniżej średniej to : " + users[i].name + " ( " + users[i].age + " lat )");
        }
    }
    public User (String name, int age) {
        this.name = name;
        this.age = age;

    }
}