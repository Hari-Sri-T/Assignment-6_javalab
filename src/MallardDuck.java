public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehaviour = new Quack();
        swimBehaviour = new SwimWithLegs();
    }

    @Override
    public void display() {
        System.out.println("I am Mallard Duck..");
    }
}
