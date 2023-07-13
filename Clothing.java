

public class Clothing  {
    private String description;
    private double price;
    private String size;
    
    private final int minPrice = 10;
    private final double tax = 0.2;
    
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return (1+tax)*price;
	}
	public void setPrice(double price) {
		//if (price >= minPrice)
			this.price = price;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
}
