import java.util.Scanner;

class TaxAmount{
    double taxAmmount;
    public double calculateTaxAmount(int ctc){
        if(ctc >=0 && ctc <=180000){
            taxAmmount = ctc;
        }
        else if (ctc <= 181001 && ctc >=300000){
            taxAmmount = (ctc*10)/100;
        }
        else if(ctc <= 300001 && ctc >=500000){
                taxAmmount = (ctc*20)/100;
        }
        return  taxAmmount;
    }

}
public class Assignment1_Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CTC");
        int CTC = sc.nextInt();
        double taxAmount = new TaxAmount().calculateTaxAmount(CTC);
        System.out.println("Calculate Tax Amount :- "+ +taxAmount);

    }
}
