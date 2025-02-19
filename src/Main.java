public class Main {
    public static void main(String[] args) {

        RubberDuck rb = new RubberDuck();
        System.out.println("--------------");
        rb.display();
        rb.performQuack();
        rb.performSwim();
        System.out.println("--------------");

        RedheadDuck rh = new RedheadDuck();
        System.out.println("--------------");
        rh.display();
        rh.performQuack();
        rh.performSwim();
        System.out.println("--------------");


        MallardDuck md = new MallardDuck();
        System.out.println("--------------");
        md.display();
        md.performQuack();
        md.performSwim();
        System.out.println("--------------");
    }
}