package kk1;

import java.util.*;
public class guvipro66 {
public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int k=in.nextInt();
	int a[]=new int[n];
	int sum=0;
	for(int i=0;i<n;i++){
		a[i]=in.nextInt();
		}
	int b=in.nextInt();
	for(int i=0;i<n;i++){
		sum=sum+a[i];
	}
	if((sum/2)==b){
		System.out.println(a[k]/2);
	}else{
		System.out.println("Bon Appetit");
	}
}
}
