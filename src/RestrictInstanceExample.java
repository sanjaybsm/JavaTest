/**
 * Created by Sanjay_Shivanna on 12/25/2017.
 */
/*SingleTonExample*/
public class RestrictInstanceExample {

    private static RestrictInstanceExample INSTANCE;

    /*make the constructor private*/
    private  RestrictInstanceExample() {
    }

    /*Single ton example*/
    public static RestrictInstanceExample  getInstance(){
        if(INSTANCE == null){
            INSTANCE = new RestrictInstanceExample();
        }
        return  INSTANCE;
    }

}
