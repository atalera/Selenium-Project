package CapG.CapGDemo;

import org.testng.annotations.*;

public class ReverseString {
	@Test
	public void revString() {
		String s1="Aanchal";
		String s = null;
		
		
		for(int i=s1.length()-1;i>0;i++) {
		 s=s+s1.charAt(i);
		}
		System.out.println(s);
	}

}
