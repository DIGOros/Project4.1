public class Main {
    public static void main(String[] args) {

        String test = "banana";
        String word ="";
        int weeks = 3;
        int days = 7;
        int n = 5;
        while (n > 0) {
            System.out.println(n);
            n = n - 1;
        }
        System.out.println("It works i suppose...");

        int i=1;
        do{
            System.out.print(i);
            i++;
        }while(i<=5);
        System.out.println("\nIt also works...");

        for(int j = 1; j < 10; j++){
            System.out.print(j);
        }
        System.out.println("\nSeems to be working too");

        for(int j = 10; j > 0; j--){
            System.out.print(j);
        }
        System.out.println("\nOk");


        for ( int l = 0; l < test.length(); l++){
            System.out.println(test.charAt(l));

        }
        System.out.println("Oh cool, next one");


        // outer loop prints weeks
        for (int c = 1; c <= weeks; ++c) {
            System.out.println("Week: " + c);

            // inner loop prints days
            for (int j = 1; j <= days; ++j) {
                System.out.println("  Day: " + j);
            }
        }
        System.out.println("Yep! That is all for here...");
    }
}