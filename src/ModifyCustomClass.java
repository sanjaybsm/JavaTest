/**
 * Created by Sanjay_Shivanna on 12/23/2017.
 */
public class ModifyCustomClass {

    public static void main(String[] args) {
        CustomClass1 val1 = new CustomClass1("Sanjay");
        CustomClass1 val2 = new CustomClass1("Rishi");
    }

    public void modifyValue(CustomClass1 c1){
        System.out.println(c1);
    }
}
