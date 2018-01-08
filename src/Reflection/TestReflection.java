package Reflection;

public class TestReflection {

    public static void main(String[] args) {
        Class<?> concreateClass = ConcreateClass.class;

        try {
            concreateClass = Class.forName("Reflection.ConcreateClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(concreateClass.getCanonicalName());

        Class<?> superClass = null;
        try {
            superClass = Class.forName("Reflection.ConcreateClass").getSuperclass();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(superClass);

        /*object creation using reflection*/
    }
}
