package StringQuestion;

import java.io.FileNotFoundException;
import java.io.IOException;

class A {
    void method() throws IOException {
        System.out.println("Method in A");
    }
}

class B extends A {
    @Override
    void method() throws FileNotFoundException { // Subclass of IOException
        System.out.println("Method in B");
    }
}

class C extends B {
    @Override
    void method() {
        System.out.println("Method in C");
        // No checked exception thrown
    }
}

