// ✅ Program 3: Smart Home Appliance Control
// Classes:
// Device (parent)
// method: turnOn(), turnOff()
// Fan (child)
// additional method: changeSpeed()
// AC (child)
// additional method: setTemperature()
// ✅ Demonstrate calling child-specific feature using typecasting.

class Device{
    void turnOn(){
        System.out.println("Device Turn On");
    }
    void turnOff(){
        System.out.println("Device Turn Off");
    }
}
class Fan extends Device{
    void changeSpeed(){
        System.out.println("Changing Speed");
    }
}
class Ac extends Device{
    void setTemprature(){
        System.out.println("Setting Temprature");
    }
}

class SmartHomeApplianceControl{
    public static void main(String []args){
        Device d1=new Fan();
        Device d2=new Ac();

        d1.turnOn();
        d2.turnOff();

        Fan fan=(Fan) d1;
        fan.changeSpeed();

        Ac ac=(Ac)d2;
        ac.setTemprature();

       
        
    }
}