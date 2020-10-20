public class Grades {
    private int[] grades;
    private int size;
    private double srednia;
    private int suma = 0;
    //private int ilosc = 0;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
        this.srednia = 0.00;
    }

    public void add (int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }
    public int last () {
        return this.grades[this.size -1];
    }

    public double avg () {
        double srednia = 0.00;
        this.suma = 0;
        //this.ilosc = this.size + 1;
        if (this.size > 0) {
            for (int i = 0; i <= this.size -1;  i++) {
                this.suma = this.suma + this.grades[i];
            }
            //this.srednia = this.suma / this.size;
            srednia = this.suma / this.size;
            return srednia;
        }
        else
            return 0;
    }
}