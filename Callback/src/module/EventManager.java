package module;
import java.util.HashMap;

public class EventManager {
	
	public EventManager() { }
	
	private static HashMap<String, ICallback> manager = new HashMap<>();
	
	/**
	 * Register subscriber.
	 * @param subscribers
	 */
    public static void register(ICallback... subscribers) {
        for(ICallback subscriber : subscribers) {
            String key = subscriber.getClass().getName();
            
            if(manager.containsKey(key))
                continue;

            manager.put(key, subscriber);
        }
    }

    public static void unregister() {
        manager.clear();
    }

    /**
     * Publish to each subscriber.
     * @param data
     * @param subscribers
     */
    @SafeVarargs
    public static void publish(Object data, Class<? extends ICallback>... subscribers) {
        try {
            for(Class<? extends ICallback> subscriber : subscribers) {
                String key = subscriber.getName();

                if(manager.get(key) == null)
                    throw new Exception(key + " is unresitered.");

                manager.get(key).subscribe(data);
            }
        } catch (Exception e) {
        	System.out.println(e.toString());
        }
    }

    /**
     * Publish to all subscribers.
     * @param data
     */
    public static void publish(Object data) {
    	try {
    		for(ICallback subsriber : manager.values()) {
                subsriber.subscribe(data);
            }
    	} catch (Exception e) {
    		System.out.println(e.toString());
    	}
    }
}
