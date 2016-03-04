import module.ICallback;

public class Subscriber3 implements ICallback {

	@Override
	public void subscribe(Object data) {
		System.out.println(getClass().getSimpleName() + " : " + data.toString());
	}
}
