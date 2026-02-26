import java.util.*;
public class search{
 int[] arr=new int[10];
 int count;
 
 
 public void get(){
  Scanner sc=new Scanner(System.in);
   System.out.println("enter the count of array:");
   this.count=sc.nextInt();
   System.out.println("enter array elements:");
   for(int i=0;i<this.count;i++){
    this.arr[i]=sc.nextInt();
    }
   }
public void itemsearch(){
int n,flag=0,i;
Scanner sc=new Scanner(System.in);
System.out.println("enter the element you want to search:");
n=sc.nextInt();
for(i=0;i<this.count;++i){
if(this.arr[i]==n){
  flag=1;
  break;
  }
}
if(flag==1){
  System.out.println("elemet is found at position"+(i+1));
  }
else{
System.out.println("element not found");
}
}
public static void main(String[]args){
 search s1=new search();
 s1.get();
 s1.itemsearch();
 }
 }
         
