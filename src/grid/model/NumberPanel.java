package grid.model;

public class NumberPanel 
{
	private int numbers;
	
	
	public String toString()
	{
		return "0 is the current number";
	}
	
	public NumberPanel()
	{
		numbers = 0;
	}
	
	public int getNumbers() {
		return numbers;
	}

	public void setNumbers(int numbers) {
		this.numbers = numbers;
	}
}
