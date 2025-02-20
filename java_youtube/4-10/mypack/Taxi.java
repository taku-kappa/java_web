package mypack;

public class Taxi extends Vehicle implements Stopable {

    public Taxi(int crewNum) {
        super.crewNum = crewNum;
    }

    public void showCrewNum() {
        System.out.println("タクシーの乗客：" + super.crewNum + "名");
    }

    public void stop() {
        System.out.println("ここで降ります");
    }
    
}
