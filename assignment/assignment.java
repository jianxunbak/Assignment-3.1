class Assignment {

    public static void main(String args[]) {

        /*
         * Task 1: Cast "price" as integer and assign it to "round".
         */
        float price = 9.9f;
        int round = 0;

        // Add code here
        round = (int) price;
        System.out.println("round prints " + round); // prints 9

        /*
         * Task 2: Cast "price" as String and assign it to "priceAsString".
         */
        String priceAsString = null;

        // Add code here
        priceAsString = String.valueOf(price);
        System.out.println("priceAsString prints " + priceAsString); // prints "9.9"
        System.out.println(priceAsString instanceof String); // prints true

        /*
         * Task 3: Cast "priceAsString" as int and assign it to "number".
         */
        int number = 0;

        // Add code here
        double num = Double.parseDouble(priceAsString);
        number = (int) num;
        System.out.println("number prints " + number); // prints 9;
    }
}
