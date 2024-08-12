// 12 Aug
public class MultipleArgs {
    int modelYear;
    String modelName;
    double engineDisp;
    int peakPower;
    int peakTorque;
    public MultipleArgs(int modelYear, String modelName, double engineDisp, int peakPower, int peakTorque) {
        this.modelYear = modelYear;
        this.modelName = modelName;
        this.engineDisp = engineDisp;
        this.peakPower = peakPower;
        this.peakTorque = peakTorque;
    }
    public static void main(String[] args) {
        MultipleArgs car1 = new MultipleArgs(2017, "HellCat", 4.1, 432, 400);
        System.out.printf("Model Year: %d\n", car1.modelYear);
        System.out.printf("Model Name: %s\n", car1.modelName);
        System.out.printf("Engine Displacement: %.2f\n", car1.engineDisp);
        System.out.printf("Peak Power: %d\n", car1.peakPower);
        System.out.printf("Peak Torque: %d\n", car1.peakTorque);
    }
}
