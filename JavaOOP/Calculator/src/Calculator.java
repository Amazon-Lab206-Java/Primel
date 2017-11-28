
public class Calculator {
	private Double OperandOne;
	private String Operation;
	private Double OperandTwo;
	private Double Result;
	
	public Calculator() {
		
	}
	
	public void setOperandOne(Double OperandOne) {
		this.OperandOne = OperandOne;
	}
	
	public void setOperandTwo(Double OperandTwo) {
		this.OperandTwo = OperandTwo;
	}
	
	public void setOperation(String Operation) {
		this.Operation = Operation;
	}
	
	public Double getOperandOne() {
		return this.OperandOne;
	}
	
	public Double getOperandTwo() {
		return this.OperandTwo;
	}
	
	public String getOperation() {
		return this.Operation;
	}
	
	public void performOperation() {
		if (this.Operation == "+") {
			Result = OperandOne + OperandTwo;
		}
		else {
			Result = OperandOne - OperandTwo;
		}
	}
	
	public Double getResults() {
		return Result;
	}
}
