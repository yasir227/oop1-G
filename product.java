
public class product {
     String code;
     double price;
     String description;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "product [code=" + code + ", price=" + price + ", description=" + description + "]";
	}
	public product(String code, double price, String description) {
		super();
		this.code = code;
		this.price = price;
		this.description = description;
	}
    

}
