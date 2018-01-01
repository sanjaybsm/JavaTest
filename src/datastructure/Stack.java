package datastructure;

import java.util.Scanner;

/**
 * Created by Sanjay_Shivanna on 12/26/2017.
 */
public class Stack {

    /*Main method of stack are push and pop*/

    int[] data = new int[10];
    int counter=0;

    public void push(int element){
        if(counter >= data.length){
            System.out.println("pop some elements...");
        }else {
            data[counter++] = element;
        }
    }

    public void pop()  {
        if(counter == 0){
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("exception");
            }
        }else{
            int value =  data[--counter];
            System.out.println("value poped"+value);
        }
    }

    public static void main(String[] args) {
        System.out.println("Simple JAVA Stack ds program \n");
        System.out.println("1.Push 2.Pop 100 to exit");
        Stack dataStructure = new Stack();
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();

        if(value.equals("100")){
            scanner.close();
        }

        while(!value.equals("100")){
            switch (value) {
                case "1":
                    dataStructure.push(10);
                    break;
                case "2":
                    dataStructure.pop();
                    break;
            }
            value = scanner.nextLine();

        }
        scanner.close();

    }

}
