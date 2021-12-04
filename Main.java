package Abstract_Factory;

public class Main {
    public static void main(String[] args) {
        Air_Factory airFactory = new Air_Factory();
        Walk_Factory walkFactory = new Walk_Factory();
        airFactory.Air_Delivery();
        walkFactory.Walk_Delivery();
           }}
