package protect;

import protect2.Parent;

class Check extends Parent {
    public static void main(String[] args) {
        Parent p = new Parent();
        Check c = new Check();
        c.hello();
        System.out.println(c.hi);
    }
}
