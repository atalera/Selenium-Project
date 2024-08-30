package CapG.CapGDemo;

import org.testng.annotations.Test;

public class ArrayMax {
	
	@Test
	public void MaxElement() {
		int n[]= {3,6,5,7,8,9,2},max=0;
		
		for(int i=0;i<n.length-1;i++) {
			for(int j=i;j<n.length;j++) {
				if(n[i]>n[j]) {
					max=n[i];
				}
				else {
					max=n[j];
				}
			}
		}
		
		System.out.println(max);
	}
	
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
