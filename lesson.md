## Part 1 - class and main method

### Step 1: Create a `Main.java`

### Step 2: Define a class `Main`. The class name must be identical to the filename.

```java
class TheMainClass{
    public static void main(String args[]){
        System.out.println(args[0]);
    }
}
```

Mentions:
- The keyword `class` is used to define a class.
- The main method is the entry point of all Java projects.
- System.out.println will output it's value to the console.

---

## Part 2 - Compile and Run 

Change directory to the `.java` file. Perform the following command to compile `.java` file into `.class`.

```sh
$ javac main.java
$ java TheMainClass "Hello World"
```

Mentions:
- The `javac` command is used to compile a `.java` file. 
- The `java` command is used to run a `.class` file produced from the `javac` command. 
- The `.class` filename will be named according to the class. 
- You can pass string values into the main method as arguments.

---

## Part 3 - Variables & Data Types

### Step 1: Create `types.java`

### Step 2: Insert the following code

```java
class DataTypesDemo {

    static int num1 = 10;
    public static void main(String args[]){
        int num2 = Integer.parseInt(args[0]); // A String need to be cast into Integer
        System.out.println(num1 + num2);
    }
}
```

> Try removing `int num2 = Integer.parseInt(args[0]);` and see what happens? 

Mentions:
- In Java, variables must belong to a data type. The data types are:
    - String
    - Char
    - Integer
    - Float
    - Boolean
- You cannot perform `11 + "1"`. This expression add a string value of `1` to integer value of `11`, which would not work. Therefore, we had to perform `Integer.parseInt()` to parse a String to an Integer.

Learners should try initializing all five data types and print them.

By the end of the attempt, the learners' code should look something like this.

```java
class DataTypesDemo {

    static int num1 = 10;
    public static void main(String args[]){
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
```

With these commands:

```sh
$ javac types.java
$ java DataTypesDemo 1
```
This output will be generated:

```
11
myName prints Neo
a prints x
n prints 5
f prints 1.45
x prints true
```