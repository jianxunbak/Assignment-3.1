## Part 1 - class and main method

### Step 1: Create a `main.java` file

### Step 2: Define a class `MainClass`. The class name must be identical to the filename.

```java
class MainClass{
  public static void main(String args[]){
    System.out.println(args[0]);
  }
}
```

Mentions:
- The keyword `class` is used to define a class.
- The main method is the entry point of all Java projects.
- System.out.println will output its value to the console.

---

## Part 2 - Compile and Run 

Change directory to the `.java` file. Perform the following command to compile `.java` file into `.class`.

```sh
$ javac main.java
$ java MainClass "Hello World"
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
---

## Part 4 (Optional) - Compiled vs Interpreted Language

There are two types of programming languages:

1. Compiled Language
2. Interpreted Language

<img src="https://ecomputernotes.com/images/difference-between-compiler-and-interpreter.png">

- Compiled languages are required to be compiled to machine code before it is being executed by the CPU.
- Interpreted languages are compiled and executed by the CPU on-the-fly.

Java is a little out of place because it requires both compilation and interpretation. It is compiled to Bytecode, then interpreted. Therefore, we may refer Java to both compiled and interpreted language ([example source](https://www.sciencedirect.com/topics/engineering/interpreted-language#:~:text=Java%20can%20be%20considered%20both,usually%20a%20software%2Dbased%20interpreter.)).

<img src="https://www3.ntu.edu.sg/home/ehchua/programming/java/images/ProgrammingSteps.png">

---

## Part 5 (Optional) - Language Type

Another differentiator to programming languages are the strong and loose type.

<img src="https://miro.medium.com/max/1400/1*BddwVWW6hFU0miT9DCbUWQ.png" style="background-color:white;">

Summary from [Source](https://medium.com/android-news/magic-lies-here-statically-typed-vs-dynamically-typed-languages-d151c7f95e2b)

- A language is **statically-typed** if the type of a variable is known at compile-time instead of at run-time.
- A language is **dynamically-typed** if the type of a variable is checked during run-time.
- A **strongly-typed** language is one in which variables are bound to specific data types, and will result in type errors if types do not match up as expected in the expression — regardless of when type checking occurs.
- A **weakly-typed (loosely-typed)** language on the other hand is a language in which variables are not bound to a specific data type; they still have a type, but type safety constraints are lower compared to strongly-typed languages.

End