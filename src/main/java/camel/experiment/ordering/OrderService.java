package camel.experiment.ordering;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** OrderService
 *
 * @author Zemian Deng
 */
public class OrderService {
	
	private static Logger logger = LoggerFactory.getLogger(OrderService.class);
	
	public void validateOrder(Order order) {
		logger.info("Order " + order.getId() + " validated.");
	}
	
	public void placeOrder(Order order) {
		logger.info("Order " + order.getId() + " has been added.");
	}
	
	public void sendEmailConfirmation(Order order) {
		logger.info("Email confirmation for order " + order.getId() + " has been sent.");
	}
}
