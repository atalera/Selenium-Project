package CapG.CapGDemo;

class StaticDemo{
static int count=0;//will get memory only once and retain its value  
  
StaticDemo(){
count++;//incrementing the value of static variable  
System.out.println(count);  
}  
  
public static void main(String args[]){  
//creating objects  
  
  
System.out.println(new StaticDemo());
}  
}  
