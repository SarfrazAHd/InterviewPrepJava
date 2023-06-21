package basics;

public class InhertitanceExample {

    public static void main(String[] args) {
        C c = new D();
        System.out.println(c.x);
        c.method();
    }
}

class C{
    int x=10;

   public void method(){
        System.out.println("method C");
    }
}

class D extends  C{
    int x = 20;


    public  void method(){
        System.out.println("method D");
    }
}