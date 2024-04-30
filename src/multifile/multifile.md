 JEP 458: Launch Multi-File Source-Code Programs is a proposal to enhance the Java application launcher (java command) to
 run a program supplied as multiple files of Java source code. This feature is aimed at improving the developer
 experience, especially for new developers and for scripting, by reducing the ceremony required to run a simple program.
 In the context of your project, this means that you can run your multi-file program directly from the source code
 without the need to compile it first. For example, if you have two Java files Hello.java and Greeting.java in the
 multifile package, you can run the Hello program directly from the source code using the following command:

```java
java multifile/Hello.java
```

 This command will compile and run the Hello.java file, and any other Java files that Hello.java depends on (in this
 case, Greeting.java), in one step. This feature is particularly useful for small programs and for quickly testing
 changes, as it eliminates the separate compilation step. Please note that this feature is proposed for a future version
 of Java and may not be available in your current JDK version. Always check the official Java documentation or the JEP
 itself for the most accurate and up-to-date information.