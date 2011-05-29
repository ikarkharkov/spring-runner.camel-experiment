package camel.experiment.ordering;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** OrderService
 *
 * @author Zemian Deng
 */
public class DummyOrderService {
	
	private static Logger logger = LoggerFactory.getLogger(DummyOrderService.class);
	
	public void validateOrder(String order) {
		logger.info("Order '" + order + "' validated.");
	}
	
	public void placeOrder(String order) {
		logger.info("Order '" + order + "' has been added.");
	}
	
	public void sendEmailConfirmation(String order) {
		logger.info("Email confirmation for order '" + order + "' has been sent.");
	}
}
