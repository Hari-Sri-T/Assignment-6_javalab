public class RedheadDuck extends Duck{

    public RedheadDuck(){
        quackBehaviour = new Quack();
        swimBehaviour = new SwimWithLegs();
    }

    @Override
    public void display() {
        System.out.println("I am a Redhead Duck !!!");

    }
}
