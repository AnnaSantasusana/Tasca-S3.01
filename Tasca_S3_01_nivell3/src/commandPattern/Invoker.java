package commandPattern;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
	
	private List<IOperation> operations = new ArrayList<>();
	
	public void receiveOperation(IOperation operation) {
		this.operations.add(operation);
	}
	
	public void performOperations() {
		this.operations.forEach(o -> o.execute());
		this.operations.clear();
	}
}
