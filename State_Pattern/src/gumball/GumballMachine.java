package gumball;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by SiyuanZeng's on 6/10/2014.
 */
public class GumballMachine {
    private final int SOLD_OUT = 0;
    private final int NO_QUARTER = 1;
    private final int HAS_QUARTER = 2;
    private final int SOLD = 3;
    private int state = SOLD_OUT;
    private int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if(count>0){
            state=NO_QUARTER;
        }

    }

    public void insertQuarter() {
        if(state == HAS_QUARTER){
            System.out.println("You can't insert another quarter");
        }else if(state == NO_QUARTER){
            state = HAS_QUARTER;
            state=HAS_QUARTER;
            System.out.println("You inserted a quarter");
        }else if(state == SOLD_OUT){
            System.out.println("You can't insert a quater, the machine has no gumball...");
        }else if(state == SOLD){
            System.out.println("PLease wait, we are giving you a gumball....");
        }

    }

    public void ejectQuarter() {
        if(state == HAS_QUARTER){
            System.out.println("Quarter returnd");
            state = NO_QUARTER;

        }else if (state == NO_QUARTER){
            System.out.println("You can't insert another quarter");

        }else if (state == SOLD){
            System.out.println("Sorry, you already turned the crank");

        }else if (state == SOLD_OUT){
            System.out.println("You can't eject, you haven't insert a quarter.");

        }


    }

    public void turnCrank() {
        if(state == HAS_QUARTER){
            System.out.println("You turned...");
            state = SOLD;
            dispense();
        }else if (state == NO_QUARTER){
            System.out.println("You turned but there is no quarter");

        }else if (state == SOLD){
            System.out.println("You turned but there is no quarter");

        }else if (state == SOLD_OUT){
            System.out.println("Turning twice doesn;t give you another gumball!");

        }
    }

    public void dispense() {
        if(state == HAS_QUARTER){
            System.out.println("No gumball dispensed");

        }else if (state == NO_QUARTER){
            System.out.println("You need to pay first");

        }else if (state == SOLD){
            System.out.println("A gumball comes rolling out the slot");
            count = count - 1;
            if (count==0){
                System.out.println("Oops, out of gumballs!");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        }else if (state == SOLD_OUT){
                System.out.println("No gumball dispensed");

        }
    }

    public void refill(int numberGumballs) {
        this.count = numberGumballs;
        state = NO_QUARTER;
    }

    public String toString() {

        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004\n");
        result.append("Inventory:"+count+" gumball");
        if(count!=1){
            result.append("s");
        }
        result.append("\nMachine is ");
        if(state == HAS_QUARTER){
            result.append("sold out");

        }else if (state == NO_QUARTER){
            result.append("waiting for quarter");

        }else if (state == SOLD){
            result.append("waiting for turn of crank");

        }else if (state == SOLD_OUT){
            result.append("delivering a gumball");

        }
        result.append("\n");
        return result.toString();


    }
}
