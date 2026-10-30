class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c = 20;
        int d = 15;

        int smallest = a;
        int second = Integer.MAX_VALUE;

        int[] arr = {a, b, c, d};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                second = smallest;
                smallest = arr[i];
            }
            else if (arr[i] < second && arr[i] != smallest) {
                second = arr[i];
            }
        }

        System.out.println("Second Smallest = " + second);
    }
}
