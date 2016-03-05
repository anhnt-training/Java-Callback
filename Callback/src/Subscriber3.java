import module.EventManager;
import module.ICallback;

public class Subscriber3 implements ICallback {

	public Subscriber3() {
		EventManager.register(this);
	}
	
	@Override
	public void subscribe(Object data) {
		System.out.println(getClass().getSimpleName() + " : " + data.toString());
	}
}
