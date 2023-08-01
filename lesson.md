# Part 1: Installation of JDK and Extension

Note: 
1. Windows users need to install WSL2 to follow this lesson.
- https://learn.microsoft.com/en-us/windows/wsl/install

2. Git setup for WSL
- https://learn.microsoft.com/en-us/windows/wsl/tutorials/wsl-git


## Terminology

- Java Development Kit (JDK) - to write code.
- Java Runtime Environment (JRE) - to run code.
- JVM is a virtual machine that runs Java bytecode. It is the engine that executes Java programs.

More info: https://www.digitalocean.com/community/tutorials/difference-jdk-vs-jre-vs-jvm

When you install JDK, JRE is part of it.

## SDKMan

SDKMan is a popular command line tool for managing multiple versions of SDKs on Unix-based systems (Linux and Mac). Commonly used to manage JDK versions.

Benefits:

- Multiple JDK versions: easily install, manage and switch between multiple versions of JDK.
  - Useful when working on different projects that require different JDK versions, or testing application compatibility across different versions.
- Isolation: JDKs are installed in local directory, avoiding conflicts with system-wide JDK installation.
- Easy updates: Update itself and all SDKs with a single command.

Install SDKMan:

```bash
$ curl -s "https://get.sdkman.io" | bash

# Note: For WSL users, you may need to install zip and unzip first.
$ sudo apt install zip unzip
```

Check if sdkman is installed:

```bash
$ sdk version
```

## Install JDK

List the available Java SDKs:

```bash
$ sdk list java
```

We will install Eclipse Temurin JDK17 because it is the latest LTS version.

```bash
$ sdk install java 17.0.8-tem
```

Check if Java is installed:

```bash
$ java -version
```

## JShell

Jshell is a REPL (Read-Eval-Print-Loop) tool that allows you to execute Java code in an interactive manner. This is useful for testing out simple Java code without having to create a Java project.

Start jshell in your terminal:

```bash
$ jshell
```

Try your first Java code:

```bash
jshell> System.out.println("Hello World");
Hello World
jshell> /exit
```

## Install Extension Pack for Java

This is a collection of extensions that can help you write Java code in VSCode.

https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack

---

## Part 2 - `class` and `main` method

### Step 1: Create a `Main.java` file

In the root folder, create a file named `Main.java`.

The naming convention for a `class` is to use **PascalCase**. This means that the first letter of each word is capitalized.

https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html

### Step 2: Define a class `Main`. The class name must be identical to the filename.

```java
public class Main {
  public static void main(String args[]){
    System.out.println(args[0]);
  }
}
```

- `class` is used to define a class.
- `main` is the entry point of all Java projects.
- `System.out.println(args[0])` will output its value to the console.
- `public` is an access modifier. It means that the class is accessible to all other classes.

---

## Part 3 - Compile and Run

To compile the file, we use the `javac` command on the java file. This generates a `.class` file of the same name.

Then, we use the `java` command to run the `.class` file. String values can be passed into the `main` method as arguments.

```sh
$ javac main.java
$ java Main "Hello World"
```

You may also run the code directly from VSCode using the "Run Java" button.

## Part 4 - Variables & Data Types

### Step 1: Create `DataTypesDemo.java`

### Step 2: Insert the following code

```java
public class DataTypesDemo {

    static int num1 = 10;
    public static void main(String args[]){
        // The String needs to be converted into an Integer
        int num2 = Integer.parseInt(args[0]);
        System.out.println(num1 + num2);
    }
}
```

🤔 Try replacing `Integer.parseInt(args[0])` with just `args[0]`. What happens and why?

In Java, variables must belong to a data type.

There are 8 primitive data types in Java:

| Whole Number | Real Number | Single Char | Boolean |
| :----------: | :---------: | :---------: | :-----: |
|     byte     |    float    |    char     | boolean |
|    short     |   double    |
|     int      |             |
|     long     |             |

You cannot perform `11 + "1"`. This expression adds a `String` value of `1` to `int` value of `11`, which would not work. Therefore, we had to perform `Integer.parseInt()` to parse a `String` to an `Integer`.

### Casting

Casting is the process of converting a value from one data type to another.

Casting can be done **explicitly** or **implicitly**.

**Explicit casting** is done by the developer using the `()` operator.

```java
int a = 10;
double b = 1.5;
int result = a + (int) b;
```

**Implicit casting** is done automatically by the compiler.

```java
int a = 10;
double b = 1.5;
double result = a + b;
```

This is possible because the converted value (`int`) fits within the range of the new data type (`double`).

In Java, there are two types of casting:

- **Widening Casting** (automatically) - converting a smaller type to a larger type size.
- **Narrowing Casting** (manually) - converting a larger type to a smaller size type.

```java
// Widening Casting
int myInt = 9;
double myDouble = myInt; // Automatic casting: int to double

System.out.println(myInt);      // Outputs 9
System.out.println(myDouble);   // Outputs 9.0

// Narrowing Casting
double myDouble = 9.78;
int myInt = (int) myDouble; // Manual casting: double to int

System.out.println(myDouble);   // Outputs 9.78
System.out.println(myInt);      // Outputs 9
```

#### Converting from `String` to `Integer`

The earlier way of using `Integer.parseInt()` is for converting a `String` to an `Integer`. It uses the `parseInt()` method from the `Integer` class. This is not the same as casting, which uses the `()` operator.

### Numeric Literal Character Suffixes

Numeric literal character suffixes are used to indicate the type of the numeric literal.

```java
// L suffix for long
long longNum = 10000000000L;

// F suffix for float
float floatNum = 1.5F;

// D suffix for double
double doubleNum = 1.5D;
```

Why do we need to specify the type of the numeric literal?

- Without the suffix, the compiler will generally treat a whole number as an `int`, and a decimal number as a `double`.

```java
// Compiler treats 1.5 as a double
float f = 1.5; // Error: incompatible types: possible lossy conversion from double to float

// For double, the suffix is optional
double d = 1.5; // No error
```

➡ Demo with int, long and casting

### 👨‍💻 Activity: Try out the different data types

Try initializing the following five data types and print them

- `String`
- `char`
- `int`
- `float`
- `boolean`

Your code should look something like this:

```java
public class DataTypesDemo {
  static int num1 = 10;
  public static void main(String args[]){
    // A String needs to be cast into Integer
    int num2 = Integer.parseInt(args[0]);
    System.out.println(num1 + num2);

    // Initializing variables of different data types.
    String myName = "Neo";
    // Note char is single quoted
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

## Part 5 - Wrapper Classes, Boxing and Unboxing

### Wrapper Classes

Recall Java has 8 primitive data types. For each of those types, there is a corresponding wrapper class (classes will be covered in more detail in a later lesson).

| Primitive Data Type | Wrapper Class |
| :-----------------: | :-----------: |
|        byte         |     Byte      |
|        short        |     Short     |
|        char         |   Character   |
|         int         |    Integer    |
|        long         |     Long      |
|        float        |     Float     |
|       double        |    Double     |
|       boolean       |    Boolean    |

Wrapper classes provide a way to use primitive data types as objects, as well as provide some simple operations, which cannot be stored on a primitive.

For example, as you saw earlier, the `Integer` class provide a useful method to convert a `String` to an `Integer`.

```java
int num = Integer.parseInt("10");
```

You can also check the maximum and minimum values of an `Integer`.

```java
System.out.println(Integer.MAX_VALUE);
System.out.println(Integer.MIN_VALUE);
```

We can declare an `Integer` object like this instead using the primitive data type:

```java
Integer num = 10;
```

But as a rule of thumb, it is better to use the primitive data type unless you need to use the wrapper class methods.

### Boxing and Unboxing

Boxing is the process of converting a primitive data type to its corresponding wrapper class.

Java does autoboxing, which is the automatic conversion of a primitive data type to its corresponding wrapper class.

```java
Integer boxedNum = 10;
```

Unboxing is the process of converting a wrapper class to its corresponding primitive data type.

Java does auto-unboxing, which is the automatic conversion of a wrapper class to its corresponding primitive data type.

```java
int unboxedNum = boxedNum;
```

## Part 6 - Reading User Input

There are a few ways to read a user's input. We will be using `System.console().readLine()`.

### Step 1: Create `UserInputDemo.java`

### Step 2: Insert the following code

```java
public class UserInputDemo {
  public static void main(String[] args) {
    String userInput = System.console().readLine("Enter your name:");
    System.out.println("Hello " + userInput);
  }
}
```

### 👨‍💻 Activity: Get 2 numbers from user and add them

Create a new file `AddTwoNumbers.java` and write a program that reads 2 numbers from the console and add them together.

## Part 7 (Optional) - Compiled vs Interpreted Language

There are two types of programming languages:

1. Compiled Language

- Translated to machine code ahead of time.
- When program is executed, machine code is loaded into memory and executed directly by CPU.
- Typically runs faster than interpreted languages since it is directly executed by CPU.
- e.g. C, C++

2. Interpreted Language

- Interpreted reads source code line by line, converts it to machine code, and executes it
- Typically slower because machine code is not stored in a file and must be generated each time the program is executed.
- e.g. JavaScript, Python

<img src="https://ecomputernotes.com/images/difference-between-compiler-and-interpreter.png" width="500">

Java is a little out of place because it requires both compilation and interpretation. Java source code is compiled to Bytecode, then interpreted and executed by the JVM. Therefore, we may refer Java to both compiled and interpreted language ([example source](https://www.sciencedirect.com/topics/engineering/interpreted-language#:~:text=Java%20can%20be%20considered%20both,usually%20a%20software%2Dbased%20interpreter.)).

<img src="https://www3.ntu.edu.sg/home/ehchua/programming/java/images/ProgrammingSteps.png">

---

## Part 8 (Optional) - Language Type

Another differentiator to programming languages are the strong and loose type. This refers to the strictness of the type-checking. E.g. strongly-type language e.g. will not allow you to add a string to an integer.

Strongly-typed language

- Type of a variable is explicitly declared (e.g. int, String)
- At compile-time, type checking is performed to ensure that the types match up as expected in the expression
- Safe and less error-prone

Loosely-typed language

- Type of a variable is inferred (e.g. var, auto)
- More flexible

In addition, these languages can be statically-typed or dynamically-typed. This refers to the timing of the type-checking.

For a statically typed language, type-checking happens at compile time. For a dynamically typed language, type-checking happens at run time.

<img src="https://miro.medium.com/max/1400/1*BddwVWW6hFU0miT9DCbUWQ.png" style="background-color:white;">

Summary from [Source](https://medium.com/android-news/magic-lies-here-statically-typed-vs-dynamically-typed-languages-d151c7f95e2b)

- A language is **statically-typed** if the type of a variable is known at compile-time instead of at run-time.
- A language is **dynamically-typed** if the type of a variable is checked during run-time.
- A **strongly-typed** language is one in which variables are bound to specific data types, and will result in type errors if types do not match up as expected in the expression — regardless of when type checking occurs.
- A **weakly-typed (loosely-typed)** language on the other hand is a language in which variables are not bound to a specific data type; they still have a type, but type safety constraints are lower compared to strongly-typed languages.

---

## Useful Tips

### Code Formatting

To configure Java code formatting in VS Code, when in a Java file, right click and select "Format Document With" and choose "Language Support for Java by Red Hat".

### Shortcuts

- Type "so" and press tab to generate `System.out.println()`
- Type "psvm" and press tab to generate `public static void main(String[] args)`

---

End
