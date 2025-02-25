package pa;
public class Taxi extends Vehicle implements Stopable {

    public Taxi(int crewNum){
        super.crewNum = crewNum;
    }

    public void showCrewNum(){
        System.out.println(super.crewNum);
    }

    public void stop(){
        System.out.println("ここで降ります");
    }
}
