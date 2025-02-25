package pa;

public class Bus extends Vehicle implements Stopable {
    public Bus(int crewNum){
        super.crewNum = crewNum;
    }

    public void showCrewNum(){
        System.out.println(super.crewNum);
    }

    public void stop(){
        System.out.println("次止まります");
    }
    
}
