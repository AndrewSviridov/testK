public interface CarMBean {

    String getMyName();

    int setSomeValue(int val);

    int getSomeValue();

    void writeToConsole(String message);

    double setValueToGauge(String val);

}
