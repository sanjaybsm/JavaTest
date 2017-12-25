/**
 * Created by Sanjay_Shivanna on 9/16/2017.
 */
public class JavaIntTest {
          public static void main(String args[])
        {
            outer :
            for(int i = 0; i < 3; i++)
            {
                for(int j = 3; j >= 0; j--)
                {
                    if(i == j) break outer;
                    System.out.println(i + " " + j);
                }
            }
        }

}
