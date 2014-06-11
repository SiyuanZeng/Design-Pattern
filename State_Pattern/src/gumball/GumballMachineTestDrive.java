package gumball;

import gumball.GumballMachine;

/**
 * Created by SiyuanZeng's on 6/10/2014.
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();;
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

    }



/*
* C:\Developer\Java\jdk1.7.0_51\bin\java -Didea.launcher.port=7533 "-Didea.launcher.bin.path=C:\Developer\JetBrains\IntelliJ IDEA 13.1.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Developer\Java\jdk1.7.0_51\jre\lib\charsets.jar;C:\Developer\Java\jdk1.7.0_51\jre\lib\deploy.jar;C:\Developer\Java\jdk1.7.0_51\jre\lib\javaws.jar;C:\Developer\Java\jdk1.7.0_51\jre\lib\jce.jar;C:\Developer\Java\jdk1.7.0_51\jre\lib\jfr.jar;C:\Developer\Java\jdk1.7.0_51\jre\lib\jfxrt.jar;C:\Developer\Java\jdk1.7.0_51\jre\lib\jsse.jar;C:\Developer\Java\jdk1.7.0_51\jre\lib\management-agent.jar;C:\Developer\Java\jdk1.7.0_51\jre\lib\plugin.jar;C:\Developer\Java\jdk1.7.0_51\jre\lib\resources.jar;C:\Developer\Java\jdk1.7.0_51\jre\lib\rt.jar;C:\Developer\Java\jdk1.7.0_51\jre\lib\ext\access-bridge-64.jar;C:\Developer\Java\jdk1.7.0_51\jre\lib\ext\dnsns.jar;C:\Developer\Java\jdk1.7.0_51\jre\lib\ext\jaccess.jar;C:\Developer\Java\jdk1.7.0_51\jre\lib\ext\localedata.jar;C:\Developer\Java\jdk1.7.0_51\jre\lib\ext\sunec.jar;C:\Developer\Java\jdk1.7.0_51\jre\lib\ext\sunjce_provider.jar;C:\Developer\Java\jdk1.7.0_51\jre\lib\ext\sunmscapi.jar;C:\Developer\Java\jdk1.7.0_51\jre\lib\ext\zipfs.jar;C:\Development_Base\Design-Pattern\State_Pattern\out\production\State_Pattern;C:\Developer\JetBrains\IntelliJ IDEA 13.1.2\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain gumball.GumballMachineTestDrive

Mighty Gumball, Inc.
Java-enabled Standing Gumball Model #2004
Inventory:5 gumballs
Machine is waiting for quarter

You inserted a quarter
You turned...
A gumball comes rolling out the slot

Mighty Gumball, Inc.
Java-enabled Standing Gumball Model #2004
Inventory:4 gumballs
Machine is waiting for quarter

You inserted a quarter
Quarter returnd
You turned but there is no quarter

Mighty Gumball, Inc.
Java-enabled Standing Gumball Model #2004
Inventory:4 gumballs
Machine is waiting for quarter

You inserted a quarter
You turned...
A gumball comes rolling out the slot
You inserted a quarter
You turned...
A gumball comes rolling out the slot
You can't insert another quarter

Mighty Gumball, Inc.
Java-enabled Standing Gumball Model #2004
Inventory:2 gumballs
Machine is waiting for quarter

You inserted a quarter
You can't insert another quarter
You turned...
A gumball comes rolling out the slot
You inserted a quarter
You turned...
A gumball comes rolling out the slot
Oops, out of gumballs!
You can't insert a quater, the machine has no gumball...
Turning twice doesn;t give you another gumball!

Mighty Gumball, Inc.
Java-enabled Standing Gumball Model #2004
Inventory:0 gumballs
Machine is delivering a gumball


Process finished with exit code 0

    *
    * */
}
