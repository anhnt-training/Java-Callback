import module.EventManager;
import module.ICallback;

public class Subscriber2 implements ICallback {

	public Subscriber2() {
		EventManager.register(this);
	}
	
	@Override
	public void subscribe(Object data) {
		System.out.println(getClass().getSimpleName() + " : " + data.toString());
	}
}
