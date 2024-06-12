package votting;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Voter> voter=new ArrayList<>();
        Voter voter1=new Voter();
        voter1.name="bhagi";
        voter1.voterID="4310";
        Voter voter2=new Voter();
        voter2.name="ashri";
        voter2.voterID="1234";
        Voter voter3=new Voter();
        voter3.name="kiran";
        voter3.voterID="5678";
        Voter voter4=new Voter();
        voter4.name="kiran";
        voter4.voterID="5678";
        Voter voter5=new Voter();
        voter5.name="dha3";
        voter5.voterID="9102";
        voter.add(voter1);
        voter.add(voter2);
        voter.add(voter3);
        voter.add(voter4);
        voter.add(voter4);

    }
}
