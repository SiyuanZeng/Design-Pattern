package gumballstate;

/**
 * Created by SiyuanZeng's on 6/10/2014.
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(12);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

    }


}


/*
*
*
* C:\Developer\Java\jdk1.7.0_51\bin\java -agentlib:jdwp=transport=dt_socket,address=127.0.0.1:49523,suspend=y,server=n -Dfile.encoding=UTF-8 -classpath "C:\Developer\Java\jdk1.7.0_51\jre\lib\charsets.jar;C:\Developer\Java\jdk1.7.0_51\jre\lib\deploy.jar;C:\Developer\Java\jdk1.7.0_51\jre\lib\javaws.jar;C:\Developer\Java\jdk1.7.0_51\jre\lib\jce.jar;C:\Developer\Java\jdk1.7.0_51\jre\lib\jfr.jar;C:\Developer\Java\jdk1.7.0_51\jre\lib\jfxrt.jar;C:\Developer\Java\jdk1.7.0_51\jre\lib\jsse.jar;C:\Developer\Java\jdk1.7.0_51\jre\lib\management-agent.jar;C:\Developer\Java\jdk1.7.0_51\jre\lib\plugin.jar;C:\Developer\Java\jdk1.7.0_51\jre\lib\resources.jar;C:\Developer\Java\jdk1.7.0_51\jre\lib\rt.jar;C:\Developer\Java\jdk1.7.0_51\jre\lib\ext\access-bridge-64.jar;C:\Developer\Java\jdk1.7.0_51\jre\lib\ext\dnsns.jar;C:\Developer\Java\jdk1.7.0_51\jre\lib\ext\jaccess.jar;C:\Developer\Java\jdk1.7.0_51\jre\lib\ext\localedata.jar;C:\Developer\Java\jdk1.7.0_51\jre\lib\ext\sunec.jar;C:\Developer\Java\jdk1.7.0_51\jre\lib\ext\sunjce_provider.jar;C:\Developer\Java\jdk1.7.0_51\jre\lib\ext\sunmscapi.jar;C:\Developer\Java\jdk1.7.0_51\jre\lib\ext\zipfs.jar;C:\Development_Base\Design-Pattern\State_Pattern\out\production\State_Pattern;C:\Developer\JetBrains\IntelliJ IDEA 13.1.2\lib\idea_rt.jar" gumballstate.GumballMachineTestDrive
Connected to the target VM, address: '127.0.0.1:49523', transport: 'socket'

Mighty Gumball, Inc.
Java-enabled Standing Gumball MOdel #2004
Inventory12 gumballs
Machine is Waiting for quarter...

You inserted a quarter
You turned...
A gumball comes rolling out the slot...

Mighty Gumball, Inc.
Java-enabled Standing Gumball MOdel #2004
Inventory11 gumballs
Machine is Waiting for quarter...

You inserted a quarter
You turned...
A gumball comes rolling out the slot...
You inserted a quarter
You turned...
Disconnected from the target VM, address: '127.0.0.1:49523', transport: 'socket'
A gumball comes rolling out the slot...

Mighty Gumball, Inc.
Java-enabled Standing Gumball MOdel #2004
Inventory9 gumballs
Machine is Waiting for quarter...


Process finished with exit code 0
* */