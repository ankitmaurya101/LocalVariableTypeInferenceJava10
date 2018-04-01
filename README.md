# Example of var keyword in Java 10

A small program showing uses of new local variable type inference feature in Java 10 introducing var keyword.

In this repository there is only one class which covers all the uses and scope of keyword "var" in Java 10.

Because as of now many IDE's are not yet supporting or upgraded to JDK 10 hence there isn't any project structure here just a class
which can easily be compiled and run through command line.

First thing first, install and set path for JDK 10 in your system.

To get started just download the TestVar.java file, compile and run on cmd or terminal depending on your system.

# About var keyword :

var keyword is an enhancement in JDK 10 (JEP-286).
Its sole purpose is to reduce complexity while declaring and initializing a local variable in java.

So a declaration like int a = 10;
can be written as     var a = 10; with condition that it should be initialized as well to get the type inference.
and hence             var b = "Ankit";
                      var d = 'A';
                      var e = new ArrayList<String>();
  All are correct and JAVA 10 will itself infer the dataType of variable.
  
# Where it can be used
  It can be used inside any block in java with the condition that it should be initialized immediately.
  
  1. It can be used in static and non-static block.
  2. It can be used in constructor.
  3. It can be used in any method.
  4. It can be used inside switch, for, if, else and all such blocks.

# Where it can not be used

1. We cannot declare field variables with var keyword.
2. Method or constructor parameters cannot be var as they can not be initialized immediately.
3. Return types also cannot be var for the same reason as above.
4. An array cannot use var as there is no way to infer the dataType,
   a user may give more than one type of data while initializing itself.

For complete information about var please click the link [JEP-286](http://openjdk.java.net/jeps/286)

For more understanding download, compile and run the TestVar.java file on cmd or terminal using Java 10.

