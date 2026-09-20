import java.util.Scanner;
 public class IT26102063Lab8Q1A{
 
    public static void main(String[] args){
	   Scanner input = new Scanner(System.in);
	   
	   int myArray[]=new int[5];
	   int i;
	   System.out.println("Enter 5 Numbers:");
	   for(i =0;i< myArray.length;i++){
		   System.out.print("Enter number "+(i+1)+":");
		   myArray[i] = input.nextInt();
	   }
	   System.out.println("Array in Reverse order:");
	   for(i=myArray.length-1;i >=0;i--){
		   System.out.println(myArray[i] + "  ");
	   }
	}
 }
	  //while(number<=5){
		   //number++;
		   //System.out.println("Enter number" + number " :");
		   //int num = input.nextInt();
	   //}

