## UnderstandingJVM
### Description
Review the code below and describe (in text or with pictures) each line from the point of view of what is happening in the JVM
```java

public class JvmComprehension {

    public static void main(String[] args) {
        int i = 1;                      // 1
        Object o = new Object();        // 2
        Integer ii = 2;                 // 3
        printAll(o, i, ii);             // 4
        System.out.println("finished"); // 7
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // 5
        System.out.println(o.toString() + i + ii);  // 6
    }
}

```
### Realization
<a href="https://github.com/imLIVI/UnderstandingJVM/blob/master/JVM.pdf">
  <img src="https://user-images.githubusercontent.com/63547457/200143389-0c867ecd-878c-438a-93f2-3c8c435755d4.png">
</a>

