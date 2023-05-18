package chapter6;

public class PhoneBillCalculator {

    public static void main(String[] args){
        PhoneBillRedo bill1 = new PhoneBillRedo();
        bill1.setId(1);
        bill1.setBaseCost(22.22);
        bill1.setAllottedMinutes(500);
        bill1.setUsedMinutes(300);
        bill1.printBill();

        PhoneBillRedo bill2 = new PhoneBillRedo(13);
        bill2.printBill();

        PhoneBillRedo bill3 = new PhoneBillRedo(42, 60, 30, 62);
        bill3.printBill();
    }
}
