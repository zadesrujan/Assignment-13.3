package bb;
//here we cretaed package as bb which that organizes a set of related classes and interfaces.
public class BuilderandBuffer {

	public static void main(String[] args) {
		//public : it can be called from anywhere.
		//static : doesn't belong to a specific object.
		//void : returns to no value.
		//main : is special because it will start the program.
		// TODO Auto-generated method stub
StringBuffer buffer=new StringBuffer("Chintu"); 
//here created StringBuffer with variable buffer
		
		
		
		System.out.println("It gives the ouput has : " +buffer);  
		
		//it prints the string  
		System.out.println("The length is : "+buffer.length());   
		//here it prints the length of the string which is 14
		System.out.println("Capacity is : "+buffer.capacity());
		
		// here first the default  capacity is 16 and it adds to the given string capacity
		
		buffer.append(" The student of ACADGILD");    //this used to append the specified string with this string      
				
		System.out.println(buffer);
		//system : is a class in java language pacakge.
		//out : static member of the system class.
		//println : to print what is message.
       
		System.out.println("The length is : "+buffer.length());
		//here the length will be 37
		System.out.println("Capacity is : "+buffer.capacity()); 
		//now its capacity will become 62
		
		buffer.append(" Is here to Learn, Do and Earn");//appending
		
		System.out.println("Capacity is : "+buffer.capacity()); 
		//gives the capacity of 126
		//system : is a class in java language pacakge.
				//out : static member of the system class.
				//println : to print what is message.
       
		
		System.out.println(buffer);
				//system : is a class in java language pacakge.
				//out : static member of the system class.
				//println : to print what is message.
       
		System.out.println("The length is : "+buffer.length()); 
		//gives the length of 67
		System.out.println("Capacity is : "+buffer.capacity());
		// here it shows like now (62*2)+2=126 i.e (old capacity*2)+2
		//this is how the append uses the capacity of string buffer or string builder
				//system : is a class in java language pacakge.
				//out : static member of the system class.
				//println : to print what is message.
       
		
	}


	}


