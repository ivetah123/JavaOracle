

public class Clothing  {
    public Clothing(String description, double price, int size) {
		super();
		this.description = description;
		this.price = price;
		setSize(size);
	}
	private String description;
    private double price;
    private String size;
    
    public static final int MIN_PRICE = 10;
    public static final double TAX = 0.2;
    
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return (1+TAX)*price;
	}
	public void setPrice(double price) {
		//if (price >= MIN_PRICE)
			this.price = price;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public void setSize(int size) {
		
        switch (size) {
                case 1:
                case 2:
                case 3:
                        this.size = "S";
                        break;

                case 6:
                        this.size = "M";
                        break;

                case 9:
                        this.size = "L";
                        break;

                case 12:
                        this.size = "XL";
                        break;

                default:
                        this.size = "unknown";
        }
	}
	
}
