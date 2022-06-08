package exercise_03;

public class PizzaClient implements PizzaApp {

    @Override
    public void acceptOrderOnline() {
        System.out.println("Accept order online");
    }

    @Override
    public void acceptWalkInOrders() {
        System.out.println("Accept walk-on orders");
    }

    @Override
    public void acceptPaymentsOnline() {
        System.out.println("Accept payments online");
    }

    @Override
    public void acceptOnlyCash() {
        System.out.println("Accept only cash");
    }

}
