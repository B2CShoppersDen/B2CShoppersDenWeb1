package com.b2cshoppersden.validation;

import java.util.ArrayList;
import java.util.List;

public class CustomerLoginValidation {
	
		public boolean validString(String username)
		{
			 boolean result=false;
		        char chars[]=username.toCharArray();
		        List<Character> alphabets=new ArrayList<>();
		        for(int i=97;i<=122;i++)
		        {
		            alphabets.add((char)i);
		        }
		        for(char ch:chars) 
		        {
		            if(alphabets.contains(ch))
		            { result=true;}
		            else if(!(alphabets.contains(ch)))
		                {result=false;}
		         }        
		        return result;
		   }
	}



