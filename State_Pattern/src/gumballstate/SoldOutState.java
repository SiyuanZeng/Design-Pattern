package gumballstate;

/**
 * Created by SiyuanZeng's on 6/10/2014.
 */
public class SoldOutState implements State {
    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert a quarter, the machine has no gumballs...");

    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject a quarter, you haven't insert a quarter...");

    }

    @Override
    public void trunCrank() {
        System.out.println("You turned, but there is no gumballs");

    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");

    }

    public String toString() {
        return "Sold out...";
    }
}
