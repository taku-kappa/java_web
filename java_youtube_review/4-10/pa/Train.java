package pa;

public class Train extends Vehicle {

    public Train(int crewNum){
        super.crewNum = crewNum;
    }

    public void showCrewNum(){
        System.out.println(super.crewNum);
    }
    
}
