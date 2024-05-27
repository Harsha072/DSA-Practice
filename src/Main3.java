 class Dad {
   final String a = "harsha";
    final void display() {
        System.out.println("Parent's display method");
    }
}

class Child extends Dad {
    // This method hides the display method of the Parent class
    void display2() {
        System.out.println("Child's display method");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Dad parent = new Child();
        parent.display();

    }
}