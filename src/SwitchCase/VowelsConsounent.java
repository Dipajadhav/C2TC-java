package SwitchCase;

import java.util.Scanner;

public class VowelsConsounent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character to print vowels and consonent: ");
		char ch=sc.next().charAt(0);
		
		switch(ch)
		{		case'a':
			
			System.out.println("Vowels");
			break;
			
        case'e':
			
			System.out.println("Vowels");
			break;
			
        case'i':
			
		System.out.println("Vowels");
		break;	
		
		
        case'o':
			
    	System.out.println("Vowels");
    	break;	
    	
        case'u':
			
        	System.out.println("Vowels");
        	break;	
		
       case'A':
			
			System.out.println("Vowels");
			break;
			
        case'E':
			
			System.out.println("Vowels");
			break;
			
        case'I':
			
		System.out.println("Vowels");
		break;	
		
		
        case'O':
			
    	System.out.println("Vowels");
    	break;	
    	
        case'U':
			
        	System.out.println("Vowels");
        	break;	
			  	
			
		default: 
			
			System.out.println("Consonent");
		
			}	
		}	

	}


