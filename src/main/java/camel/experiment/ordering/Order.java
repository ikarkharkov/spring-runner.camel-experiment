package camel.experiment.ordering;

import java.util.List;

/** Order
 *
 * @author Zemian Deng
 */
public class Order {
	private Long id;
	private List<OrderDetail> orderDetails;
	private String cutomerFullName;
	private String cutomerPhone;
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
	 * @return the orderDetails - List<OrderDetail>
	 */
	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}
	/**
	 * Setter
	 * @param orderDetails List<OrderDetail>, the orderDetails to set
	 */
	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}
	/**
	 * Getter.
	 * @return the cutomerFullName - String
	 */
	public String getCutomerFullName() {
		return cutomerFullName;
	}
	/**
	 * Setter
	 * @param cutomerFullName String, the cutomerFullName to set
	 */
	public void setCutomerFullName(String cutomerFullName) {
		this.cutomerFullName = cutomerFullName;
	}
	/**
	 * Getter.
	 * @return the cutomerPhone - String
	 */
	public String getCutomerPhone() {
		return cutomerPhone;
	}
	/**
	 * Setter
	 * @param cutomerPhone String, the cutomerPhone to set
	 */
	public void setCutomerPhone(String cutomerPhone) {
		this.cutomerPhone = cutomerPhone;
	}
	
	
}
