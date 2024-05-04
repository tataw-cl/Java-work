# Stack Implementation in Java

This is a simple implementation of a stack in Java. The `Stack` class has the following properties:

- This file contains the implementation of a stack data structure in Java.
- A stack is a Last-In-First-Out (LIFO) data structure, where elements are
- added and removed from the top of the stack.

### variables and methods used

- `value`: The value of the element.
- `size`: The size of the stack. This is a constant with a value of `6`.
- `stack`: An array of integers that represents the stack.
- `top`: The index of the top element in the stack. This is `-1` when the stack is empty.

The `Stack` class also has the following methods:

- `IsEmpty()`: Returns `true` if the stack is empty and `false` otherwise.
- `IsFull()`: Returns `true` if the stack is full and `false` otherwise.

### Usage:

- 1.  Create a new instance of the Stack class: Stack stack = new Stack();
- 2.  Add elements to the stack using the push() method: stack.push(element);
- 3.  Remove elements from the stack using the pop() method: stack.pop();
- 4.  Check if the stack is empty using the isEmpty() method: stack.isEmpty();
- 5.  Get the size of the stack using the size() method: stack.size();

## How to Run

1. Open the terminal in Visual Studio Code by going to `View -> Terminal` or by pressing `Ctrl+` backtick (`).

2. Navigate to the directory where your `src` folder is located since it is in a package called Data_Structures and the terminal will need the fully qualified name containing the main method. For example, if your `Stack.java` file is in a directory called `src/Data_Structures`, you would type `cd src`.

3. Compile your `Stack.java` file using the `javac` command. For your `Stack.java` file, you would type `javac Data_Structures/Stack.java`. This will create a `Stack.class` file in the same directory.

4. Run the compiled class using the `java` command. For your `Stack` class, you would type `java Data_Structures.Stack`.

Here's how the commands look:

```bash
cd path/to/your/java/src_folder
javac Data_Structures/Stack.java
java Data_Structures.Stack
-
- Note: This implementation of the stack is not thread-safe.
```
