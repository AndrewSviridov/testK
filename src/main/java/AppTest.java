import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.Metrics;
import io.micrometer.core.instrument.composite.CompositeMeterRegistry;
import io.micrometer.core.instrument.simple.SimpleMeterRegistry;

import javax.management.*;
import java.lang.management.ManagementFactory;

public class AppTest {
    public static void main(String[] args) throws InterruptedException, MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException {

        CompositeMeterRegistry compositeRegistry = new CompositeMeterRegistry();
        SimpleMeterRegistry oneSimpleMeter = new SimpleMeterRegistry();

        compositeRegistry.add(oneSimpleMeter);

        Metrics.counter("objects.instance").increment();
        //new CountedObject();

        Counter counter = oneSimpleMeter.counter("page.visitors", "age", "20s");


        Counter counter2 = Counter
                .builder("instance")
                .description("indicates instance count of the object")
                .tags("dev", "performance")
                .register(oneSimpleMeter);

        counter2.increment(2.0);

        Car testCar = new Car();
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        ObjectName name = new ObjectName("org.example:type=Car");
        Car mbean = new Car();
        mbs.registerMBean(mbean, name);
        System.out.println("---------------");
        System.out.println("Waiting forever...");
        Thread.sleep(Long.MAX_VALUE);
    }
}
