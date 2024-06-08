package innerclasses;

class OuterClass {
    int x = 10;

    //an inner class can be private or protected.
    /*private*/
    static class InnerClass {
        int y = 5;
    }
}

public class Main {
    public static void main(String[] args) {
//        OuterClass myOuter = new OuterClass();
//        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        OuterClass.InnerClass myInner = new OuterClass.InnerClass();
        System.out.println(myInner.y);
//        System.out.println(myInner.y + myOuter.x);
    }

}
