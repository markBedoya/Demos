public class Lambdas {
    public static void main(String[] args) {
        //old way - Anonymous function
        //side note: we see format a lot in java script
        Runnable r1 = new Runnable() {
            public void run() {
                System.out.println("Get off my lawn");
            }
        };

        r1.run();

        // new way - Lambdas Functions
        // ways of passing in fucntions by arrows
        // this is functional programming, not object oriented programming
        // whatever is after the arrow goes into Runnable and the input in in the () thats currently empty
        Runnable r2 = () -> System.out.println("The future is now");

        r2.run();
    }
}