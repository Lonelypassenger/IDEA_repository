package entity;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 10:03 2019/9/7
 * @MODIFY:
 */
public class Add {
    private String lock;
    public Add(String lock){
        this.lock = lock;
    }
    public void add(){
        synchronized (lock) {
            ValueObject.list.add("anything");
            lock.notifyAll();
        }
    }
}
