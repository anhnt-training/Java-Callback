import module.EventManager;

public class Main {

	public static void main(String[] args) {
		Subscriber1 subscriber1 = new Subscriber1();
		Subscriber2 subscriber2 = new Subscriber2();
		Subscriber3 subscriber3 = new Subscriber3();
		
		EventManager.publish("Hello,"); //Publish to all subscribers.
		EventManager.publish("world!", Subscriber1.class, Subscriber3.class); //Publish to each subscriber.
	}
}