package concurrency;

public class SerialNumberGenerator {
    private static volatile int serialNumber = 0;
    public static int nextSerialNumber(){
        return serialNumber++;//线程不安全
    }
}
