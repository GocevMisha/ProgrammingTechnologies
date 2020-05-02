package sync;

public class U1901Bank {
    int intTo;
    int intFrom = 220;

    synchronized public void calc(int intTransaction, long lngTimeout){
        System.out.println("Before - from " + intFrom + " to " + intTo + " " + Thread.currentThread().getName());
        this.intFrom -= intTransaction;
        try {
            Thread.sleep(lngTimeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.intTo += intTransaction;
        System.out.println("After - from " + intFrom + " to " + intTo + " " + Thread.currentThread().getName());
    }
}
