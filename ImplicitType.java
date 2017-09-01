
/*here we are showing that the implementing of implicit type of promotion 
    any smaller data type  when put into a bigger data type then it is automatically
  converted and is known as implicit conversion
*/
package session7;// here I have created a package as session7

public class ImplicitType {
	//declares a class called UsingObject
			//classes are the basics of opps(object oriented programming

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		//Here public is a access modifier which defines who can access this method
		//Here static a keyword which identifies class related thing
		//void is used to define return type of the method,void means method wont return any value
		//main is name of method
		//declares method String[]
		//String[]args means arguments will be passed into main method and says that main() as a parameter
             byte b= 19; //we are taking byte data type and initialized the variable as 19
             int x = 297;  //and another variable of integer data type which is greater than byte data type that is 297
             System.out.println("b : " +b+ "\n x :" +x ); 
           //system is used to return code
             //out is a static number
         	//Println is used to print text and gives output of b
             
             b=(byte)x;
             
             System.out.println("int to byte  : " +b );
           //system is used to return code
           //out is a static number
         	//Println is used to print text int to byte and gives output
             x = b ;//xequals to b
             System.out.println("byte to int  : " +x );
           //system is used to return code
           //out is a static number
         	//Println is used to print text byte to int and gives output
             
             int i= 190;//initializing 1 value
             float f = i;//initializing f value
             System.out.println("int to float : " +f );
           //system is used to return code
           //out is a static number
         	//Println is used to print text int to float and gives output
	       short y =(short)f;
	       System.out.println("float to short  : " +y );
	     //system is used to return code
	     //out is a static number
	   	//Println is used to print text float to short and gives output
	        
	}

}