/**
 * Created by Sanjay_Shivanna on 12/23/2017.
 */
public class ModifyCustomClass {

    public static void main(String[] args) {
        CustomClass1 val1 = new CustomClass1("Sanjay");
        CustomClass1 val2 = new CustomClass1("Rishi");
        System.out.println("Before swap "+val1.toString()+":"+val2.toString());
        val2 = val1;
        /*http://www.informit.com/articles/article.aspx?p=174371&seqNum=4*/
        
        System.out.println("After swap "+val1.toString()+":"+val2.toString());
    }

    public void modifyValue(CustomClass1 c1){
        System.out.println(c1);
    }
}
