class Main {
    public static void main(String[] args) {

        int tamil = 80;
        int english = 75;
        int maths = 90;
        int science = 85;
        int social = 70;

        int total = tamil + english + maths + science + social;
        float avg = total / 5.0f;

        System.out.println("Total = " + total);
        System.out.println("Average = " + avg);

        if (avg >= 90) {
            System.out.println("Grade A");
        }
        else if (avg >= 75) {
            System.out.println("Grade B");
        }
        else if (avg >= 50) {
            System.out.println("Grade C");
        }
        else {
            System.out.println("Fail");
        }
    }
}
