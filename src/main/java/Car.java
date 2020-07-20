import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.simple.SimpleMeterRegistry;

import java.util.ArrayList;
import java.util.List;

public class Car implements CarMBean {
    private int number = 0;
    SimpleMeterRegistry registry = new SimpleMeterRegistry();
    List<String> list = new ArrayList<>(4);

    //датчик
    Gauge gauge = Gauge
            .builder("cache.size", list, List::size)
            .register(registry);

    @Override
    public String getMyName() {
        return "carrrr";
    }

    @Override
    public int setSomeValue(int val) {
        return number = number + val;
    }

    @Override
    public int getSomeValue() {
        return number;
    }

    @Override
    public void writeToConsole(String message) {
        System.out.println(message);
    }

    @Override
    public double setValueToGauge(String val) {
        list.add(val);
        return gauge.value();

    }
}
