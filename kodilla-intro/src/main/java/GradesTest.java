public class GradesTest {
    public static void main(String[] args) {
        Grades oceny = new Grades();
        oceny.add(3);
        System.out.println("Ostatnia ocena to : " + oceny.last() + " średnia ocen teraz to : " + oceny.avg() );
        System.out.format("The average is: %.3f", oceny.avg());
        System.out.println(" ");
        oceny.add(4);
        System.out.println("Ostatnia ocena to : " + oceny.last() + " średnia ocen teraz to : " + oceny.avg() );
        System.out.printf("%.2f", oceny.avg(), "  ");
        System.out.println(" ");
        oceny.add(6);
        System.out.println("Ostatnia ocena to : " + oceny.last() + " średnia ocen teraz to : " + oceny.avg() );
        oceny.add(4);
        System.out.println("Ostatnia ocena to : " + oceny.last() +" średnia ocen teraz to : " + oceny.avg() );
        oceny.add(1);
        System.out.println("Ostatnia ocena to : " + oceny.last() + " średnia ocen teraz to : " + oceny.avg() );
        oceny.add(3);
        System.out.println("Ostatnia ocena to : " + oceny.last() + " średnia ocen teraz to : " + oceny.avg() );
        oceny.add(4);
        System.out.println("Ostatnia ocena to : " + oceny.last() + " średnia ocen teraz to : " + oceny.avg() );
        oceny.add(6);
        System.out.println("Ostatnia ocena to : " + oceny.last() + " średnia ocen teraz to : " + oceny.avg() );
        oceny.add(5);
        System.out.println("Ostatnia ocena to : " + oceny.last() + " średnia ocen teraz to : " + oceny.avg() );
        oceny.add(1);
        System.out.println("Ostatnia ocena to : " + oceny.last() + " średnia ocen teraz to : " + oceny.avg() );
        // "dodanie" 11 oceny powinno się nie udac...
        System.out.println("Dodanie 11 oceny '99'... ");
        oceny.add(99);
        System.out.println("Ostatnia ocena to : " + oceny.last() + " średnia ocen teraz to : " + oceny.avg() );

        return;

    }
}