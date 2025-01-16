public class BluePrint {
    public static void main(String[] args) {
        // 「クラスにメソッドを定義しよう」
        Hello player = new Hello();
        player.sayHello();
    }
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



