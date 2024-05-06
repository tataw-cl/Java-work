# Java Tutorials

This repository contains a collection of Java tutorials.

## Submit Directory

The `src/Submit` directory contains the following Java files:

- `TaskA.java`: This file demonstrates how to perform inheritance and how to call and use contructors from the parent class in the child "Box" class
- `TaskB.java`: This file illustrates the concept of interfaces and provides an example implementation.
- `TaskC.java`: This file illustrates the concept of local innner classes and how to access and declare values from the superclass, innerclass in the the main public function which is called 'TaskC'.
- `TaskD.java`: This file illustrates the concept of enumerrators. It gives an example of enum declaration, instantiation and enum call in the main body.
- `TaskE.java`: This file with the aid of an example implementation illustrates the concept of inner classes and accessing values of the outer class from the inner class for manipulation using the "Outerclass.this.Value" method.

## Running the Java Files

To run the Java files in the VSCode terminal, follow these steps:

1. Open the integrated terminal in VSCode by navigating to `View -> Terminal` or using the shortcut `Ctrl + `.

2. Navigate to the root directory of your project. Example:

   ```
   cd /c:/Users/user/Desktop/Java-work/Tutorials
   ```

3. Compile the Java files using the `javac` command. For example, to compile `TaskA.java`, run the following command:

   ```
   javac src/Submit/TaskA.java
   ```

4. Once the compilation is successful, you can run the Java program using the `java` command. For example, to run `TaskA.java`, execute the following command:

   ```
   java -cp src Submit.TaskA
   ```

   Note: The `-cp` flag specifies the classpath, and `Submit.TaskA` is the fully qualified name of the class containing the `main` method.

That's it! You should now be able to run the Java files in the `src/Submit` directory using the VSCode terminal.
