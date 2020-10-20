public class FirstClass {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------");
        Notebook notebook = new Notebook("600g", 500, 2020);
        System.out.println("Notebook z roku " + notebook.year + " waży " + notebook.weight + " i kosztuje " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        System.out.println("-----------------------------------------------------");
        //
        Notebook heavyNotebook = new Notebook("2000g", 1111, 2005);
        System.out.println("heavyNotebook z roku " + heavyNotebook.year + " waży " + heavyNotebook.weight + " i kosztuje " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        System.out.println("-----------------------------------------------------");
        //
        Notebook oldNotebook  = new Notebook("1200g", 599, 2010);
        System.out.println("oldNotebook z roku " + oldNotebook.year + " waży " + oldNotebook.weight + " i kosztuje " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        System.out.println("-----------------------------------------------------");
        //
        Notebook lightCheap  = new Notebook("444g", 533, 2020);
        System.out.println("lightCheap z roku " + lightCheap.year + " waży " + lightCheap.weight + " i kosztuje " + lightCheap.price);
        lightCheap.checkPrice();
        lightCheap.checkWeight();
        System.out.println("-----------------------------------------------------");
        Notebook oldHeavy  = new Notebook("3500g", 400, 1999);
        System.out.println("oldHeavy z roku " + oldHeavy.year + " waży " + oldHeavy.weight + " i kosztuje " + oldHeavy.price);
        oldHeavy.checkPrice();
        oldHeavy.checkWeight();
        System.out.println("-----------------------------------------------------");

    }
}