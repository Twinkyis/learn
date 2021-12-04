package Abstract_Factory;

public class Air_Factory implements Delivery_Service{

    public void Air_Delivery(){

    Bigbox bigbox = new Bigbox() {
    public void size() {super.size();}
    public void color() {super.color();}};

    Courier_Air courier_air= new Courier_Air() {
        public void name() {super.name();}
        public void tdelivery() {super.tdelivery();}};}

    public void Walk_Delivery(){}
}
