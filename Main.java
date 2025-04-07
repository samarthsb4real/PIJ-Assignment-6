public class Main {
    public static void main(String[] args) {

        // creating objects of all ducks
        MallardDuck md = new MallardDuck();
        RedHeadDuck rhd = new RedHeadDuck();
        RubberDuck rd = new RubberDuck();
        DecoyDuck dd = new DecoyDuck();

        // calling display method of all ducks
        System.out.println("------------------");
        md.display();
        md.performQuack();
        md.performSwim();
        md.performFly();
        System.out.println("------------------");
        rhd.display();
        rhd.performQuack();
        rhd.performSwim();
        rhd.performFly();
        System.out.println("------------------");
        rd.display();
        rd.performQuack();
        rd.performSwim();
        rd.performFly();
        System.out.println("------------------");
        dd.display();
        dd.performQuack();
        dd.performSwim();
        dd.performFly();
        System.out.println("------------------");
    }
}
