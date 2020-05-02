public class U0901WorkArray <T extends Number> {
    private T[] arrNums;

    public U0901WorkArray(T[] numP) {
        arrNums = numP;
    }
    public double sum(){
        double doubleWork = 0;
        for (T a: arrNums){
            doubleWork += a.doubleValue();
        }
        return doubleWork;
    }
}
