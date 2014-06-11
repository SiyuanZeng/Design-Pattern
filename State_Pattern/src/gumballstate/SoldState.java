package gumballstate;

/**
 * Created by SiyuanZeng's on 6/10/2014.
 */
public class SoldState implements State {
    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball...");

    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank...");

    }

    @Override
    public void trunCrank() {
        System.out.println("Turning twice doesn't giving another gumball...");

    }

    @Override
    public void dispense() {
        gumballMachine.releaseBAll();// this step is important reduce the amount.
        if(gumballMachine.getCount()>0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }else {
            System.out.println("Oops, out of gumball!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }

    }

    public String toString() {
        return null;
    }
}
