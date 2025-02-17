import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {





        //1)
//          for(int item: primeNumbers()){
//              System.out.print(item+" ");
//          }
        /*пока изучал методы для работы с массивами нашел этот метод снизу. Хотел спросить какая реализация лучше(эффективнее)
         та что сверху через foreach или нижняя*/
//        System.out.println(Arrays.toString(primeNumbers()));



        //2)
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("\nEnter Numb:");
//        int num =scanner.nextInt();
//        System.out.println(num+" is Palindrome: "+isPalindrome(num));

        //3)
        int[]arr=new int[]{7,2,9,4};
        System.out.println(Arrays.toString(arrayReverse(arr)));

    }

    //1) С помощью циклов вывести на экран все простые числа от 1 до 100.
    public static int[] primeNumbers(){
        int[] primeNumbsArr=new int[25];
        int iterator=0;
        boolean isNotPrime;
        for (int i=1;i<100;i++){
            isNotPrime=false;
            for (int j=2;j<=10;j++){
                if(j!=i&&i%j==0||i==1){
                    isNotPrime=true;
                    break;
                }
            }
            if(!isNotPrime){
                primeNumbsArr[iterator]=i;
                iterator++;
            }
        }
        return primeNumbsArr;
    }

    //2)С клавиатуры вводиться шестизначное число. Проверить, является ли оно палиндромом.
    public static boolean isPalindrome(int num){
        boolean isPalind=true;
        int iterator=5;
        String str=Integer.toString(num);
        char[] arr=str.toCharArray();
        for (int i=0;i<3;i++){
            if(arr[i]!=arr[iterator]){
                isPalind=false;
            }
            iterator--;
        }
        return isPalind;
    }

    //3)Написать код для зеркального переворота массива
    public  static int[] arrayReverse(int[]arr){
        int numOne;
        int numTwo;
        int iteratorFromEnd=arr.length-1;
        for (int i=0;i<arr.length/2;i++){
            numOne=arr[i];
            numTwo=arr[iteratorFromEnd-i];
            arr[i]=numTwo;
            arr[iteratorFromEnd-i]=numOne;
        }
        return arr;
    }

}
