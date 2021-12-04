package Abstract_Factory;

public class Walk_Factory implements Delivery_Service{

    public void Walk_Delivery(){
    Smallbox smallbox = new Smallbox() {
        public void size() {super.size();}
        public void color() {super.color();}};

    Courier_walk courier_walk = new Courier_walk() {
        public void name() {super.name();}
        public void tdelivery() {super.tdelivery();}};
    }

    public void Air_Delivery(){
    }
}
