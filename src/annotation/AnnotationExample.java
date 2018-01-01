package annotation;

/**
 * Created by Sanjay_Shivanna on 12/29/2017.
 */
public class AnnotationExample {

    public static void main(String[] args) {
        AnnotationExample example = new AnnotationExample();
        example.myMethod();
    }
    
    @customannotation(date = "today")
    public void myMethod(){
        System.out.println("check");
    }
}
