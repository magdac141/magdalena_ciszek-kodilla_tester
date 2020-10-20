public class Notebook {
    String weight;
    int price;
    int year;
    String strW = "";
    int weightInt = 0;
    int yearOld = 2010;
    int yearNew = 2018;

    public Notebook(String weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
        this.strW = this.weight;
    }

    public void checkPrice() {
        if (this.price < 600) {
            if (this.year <= yearOld) System.out.println("This notebook is very cheap and very OLD");
            else if (this.year > yearOld && this.year <= yearNew ) System.out.println("This notebook is very cheap and not so old");
            else System.out.println("This notebook is very cheap AND new...is that real price for such new hardware?");
        }
        else if (this.price >= 600 && this.price <= 1000 ) {
            if (this.year <= yearOld) System.out.println("The price is good but notebook is very OLD");
            else if (this.year > yearOld && this.year <= yearNew ) System.out.println("The price is good and notebook is not so old");
            else System.out.println("The price is good AND notebook is new.");
        }
        else {
            if (this.year <= yearOld) System.out.println("This notebook is Expensive and OLD. Bad deal.");
            else if (this.year > yearOld && this.year <= yearNew ) System.out.println("This notebook is expensive and not so old");
            else System.out.println("This notebook is expensive BUT NEW");
        }
    }
    public void checkWeight() {
        this.strW = this.strW.substring(0, this.strW.length()-1);
        weightInt = Integer.parseInt(this.strW.trim());
        if (weightInt < 1000) System.out.println("This notebook is light.");
        else if (weightInt >= 1000 && weightInt <= 1800) {
            System.out.println("This notebook is not so heavy.");
        }
        else {
            System.out.println("This notebook is VERY heavy.");
        }
    }
}