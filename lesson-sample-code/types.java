class DataTypesDemo {

  static int num1 = 10;
  public static void main(String args[]) {
    int num2 = Integer.parseInt(args[0]); // A String need to be cast into Integer
    System.out.println(num1 + num2);

    // Initializing variables of different data types.
    String myName = "Neo";
    char a = 'x';
    int n = 5;
    float f = 1.45f;
    boolean x = true;

    // Printing them onto the console.
    System.out.println("myName prints " + myName);
    System.out.println("a prints " + a);
    System.out.println("n prints " + n);
    System.out.println("f prints " + f);
    System.out.println("x prints " + x);
  }
}
