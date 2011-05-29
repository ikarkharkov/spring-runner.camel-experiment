package camel.experiment.ordering;

/** OrderDetail
 *
 * @author Zemian Deng
 */
public class OrderDetail {
	private Long id;
	private Long productId;
	private String productName;
	private int quantity;
	private Double unitPrice;
	/**
	 * Getter.
	 * @return the id - Long
	 */
	public Long getId() {
		return id;
	}
	/**
	 * Setter
	 * @param id Long, the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * Getter.
	 * @return the productId - Long
	 */
	public Long getProductId() {
		return productId;
	}
	/**
	 * Setter
	 * @param productId Long, the productId to set
	 */
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	/**
	 * Getter.
	 * @return the productName - String
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * Setter
	 * @param productName String, the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * Getter.
	 * @return the quantity - int
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * Setter
	 * @param quantity int, the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * Getter.
	 * @return the unitPrice - Double
	 */
	public Double getUnitPrice() {
		return unitPrice;
	}
	/**
	 * Setter
	 * @param unitPrice Double, the unitPrice to set
	 */
	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
}
