package mypack;

public class Bus extends Vehicle implements Stopable {
    public Bus(int crewNum) {
        super.crewNum = crewNum;
    }

    public void showCrewNum() {
        System.out.println("バスの乗客：" + super.crewNum + "名");
    }

    public void stop() {
        System.out.println("次止まります");
    }
    
}
