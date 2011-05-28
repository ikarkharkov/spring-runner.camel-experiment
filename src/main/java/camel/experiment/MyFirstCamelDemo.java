package camel.experiment;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A simple example to get started with Apache Camel.
 *
 * @author Zemian Deng
 */
public class MyFirstCamelDemo {
	
	private static Logger logger = LoggerFactory.getLogger(MyFirstCamelDemo.class);
	
	public static void main(String[] args) throws Exception {
		// Setup a camel route and start it.
		final CamelContext context = new DefaultCamelContext();
		context.addRoutes(new RouteBuilder() {
		    public void configure() {
		        from("file://target/file-input").process(new Processor() {
		            public void process(Exchange e) {
		            	logger.info("Received exchange message: " + e.getIn());
		            }
		        });
		    }
		});
		context.start();
		
		// Register shutdown.
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				try {
					context.stop();
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
		});
		
		// Put main to sleep.
		while(true)
			Thread.sleep(Long.MAX_VALUE);
	}
}
