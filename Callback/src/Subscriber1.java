import module.EventManager;
import module.ICallback;

public class Subscriber1 implements ICallback {
	
	public Subscriber1() {
		EventManager.register(this);
	}

	@Override
	public void subscribe(Object data) {
		System.out.println(getClass().getSimpleName() + " : " + data.toString());
	}
}
