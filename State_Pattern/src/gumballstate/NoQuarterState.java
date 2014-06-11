package gumballstate;

/**
 * Created by SiyuanZeng's on 6/10/2014.
 */
public class NoQuarterState implements State {
    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());

    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void trunCrank() {
        System.out.println("You turned, but there's no quarter");

    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");

    }

    public String toString() {
        return "Waiting for quarter...";
    }
}
