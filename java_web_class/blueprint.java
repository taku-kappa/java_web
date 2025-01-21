public class BluePrint {
    public static void main(String[] args) {
        // 「クラスにメソッドを定義しよう」
        Hello player = new Hello();
        player.sayHello();


        // 「オーバーロードされたメソッドを呼び出す」
        sayHello_1();
        sayHello_1("java");
    }


        // 「オーバーロードされたメソッドを呼び出す」
    public static void sayHello_1(){
        System.out.println("hello paiza");
    }

    public static void sayHello_1(String targets){
        System.out.println("hello " + targets);
    }
    // 「オーバーロードされたメソッドを呼び出す」⬅︎ ここまで

}


// 「クラスにメソッドを定義しよう」⬅︎ ここから
class Greeting {
    public String msg;
    public String target;

    public Greeting() {
        msg = "hello";
        target = "paiza";
    }
}

class Hello extends Greeting {
    public void sayHello() {
        System.out.println(msg + " " + target);
    }
    
}
// 「クラスにメソッドを定義しよう」⬅︎ ここまで





