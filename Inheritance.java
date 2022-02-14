class Bike {
    // the Bicycle class has two fields
    public int gear;  //data members
    public int speed;
 
    //parametrised constructor
    public Bike(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }
    
    //add default constructor

    // the Bike class has three methods
    public void applyBrake(int decrement)
    {
        speed -= decrement; //speed = speed - decrement
    }
 
    public void speedUp(int increment)
    {
        speed += increment;
    }
 
    // toString() method to print info of Bicycle
    public String toString()
    {
        return ("No of gears are " + gear + "\n"
                + "speed of bicycle is " + speed);
    }
}
 
// derived class
class MountainBike extends Bike {
 
    // the MountainBike subclass adds one more field
    public int seatHeight;
 
    // the MountainBike subclass has one constructor
    public MountainBike(int gear, int speed,
                        int seatHeight)
    {
        // invoking base-class(Bicycle) constructor
        super(gear, speed); //call constructor of base/parent/super class
        this.seatHeight = seatHeight;
    }
 
    // the MountainBike subclass adds one more method
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }
 
    // overriding toString() method
    // of Bicycle to print more info
    @Override public String toString()
    {
        return (super.toString() + "\nseat height is "
                + seatHeight);
    }
}
 
// driver class
public class Inheritance {
    public static void main(String args[])
    {
 
        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println(mb.toString());
    }
}
