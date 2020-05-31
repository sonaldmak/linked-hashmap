import java.util.LinkedHashMap;

public class demo {
	public static class LinkedHashMapExample {
	    public static void main(String[] args) {
	        LinkedHashMap<Integer, String> customerIdNameMapping = new LinkedHashMap<>();

	        customerIdNameMapping.put(100, "Jose");
	        customerIdNameMapping.put(102, "Dayna");
	        customerIdNameMapping.put(103, "Stafy");
	        customerIdNameMapping.put(104, "Alex");
	        customerIdNameMapping.put(105, "Marc");
	        
	        System.out.println("customerIdNameMapping : " + customerIdNameMapping);
	    }
	}
}
