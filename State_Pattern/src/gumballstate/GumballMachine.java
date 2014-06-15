package gumballstate;

/**
 * Created by SiyuanZeng's on 6/10/2014.
 */
public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    State state = soldOutState;
    int count =0;

    public GumballMachine (int numberGumball){
        // instantiate states when everything is up
        // pass itself to all the states

        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState((this));
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);

        this.count = numberGumball;
        if(numberGumball > 0){
            state = noQuarterState;
        }

    }


    public void insertQuarter(){
        state.insertQuarter();
    }


    public void ejectQuarter(){
        state.ejectQuarter();

    }

    public void turnCrank(){
        state.trunCrank();
        state.dispense();

    }

    void releaseBAll(){
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0){
            count = count -1;
        }

    }

    int getCount(){
        return count;
    }

    void refill(int count){
        this.count = count;
        state = noQuarterState;
    }

    void setState (State state){
        this.state = state;

    }


    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public void setHasQuarterState(State hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getState() {
        return state;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\nMighty Gumball, Inc.");
        stringBuffer.append("\nJava-enabled Standing Gumball MOdel #2004");
        stringBuffer.append("\nInventory" + count + " gumball");
        if(count != 1){
            stringBuffer.append("s");
        }
        stringBuffer.append("\n");
        stringBuffer.append("Machine is " + state + "\n");
        return stringBuffer.toString();
    }
}


