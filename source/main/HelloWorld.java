package main;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;


public class HelloWorld {

	private int num;

	//private String str = "Hello World!";
	
	public HelloWorld(String _num){

		this.num = Integer.valueOf(_num).intValue();
	}
	
	/*function prints "Hello World!", a random wait time of
	 * 0-10 seconds between each character */
	public void hello1(String str){
		
		Random rand = new Random();
		for (int i=0; i < str.length(); i++){
			/*sleep for a random time, 0 - 10 seconds*/
			int time = rand.nextInt(10000);
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				
				System.err.println("Error: " + e.getMessage());
			}
			System.out.print(str.charAt(i));
			
		}
		System.out.print("\n");
		return;
	}
	
	/*function prints "Hello World!", with one second between each character */
	public void hello2(String str){
		for(int i=0; i<str.length(); i++){
			int time = 1000;
			try{
			Thread.sleep(time);
			}catch(InterruptedException e){
				System.err.println("Error: " + e.getMessage());				
			}
			System.out.print(str.charAt(i));
		}
		System.out.print("\n");
		return;
	}
	
	public void hello3(String str){
		System.out.print(str + "\n");
		return;
	}
	
	/*Function prints "Hello World!", characters are stored in a
	 * LinkedList which uses memory storing objects, and get and add 
	 * run in O(n) time*/
	public void hello4(String str){
		LinkedList<Character> list = new LinkedList<Character>();
		for (int i = 0; i< str.length(); i++){
			list.add(str.charAt(i));
		}
		for(int i = 0; i < str.length(); i++){
		System.out.print(list.get(i)*num);
		}
		System.out.print("\n");
		return;
	}
	
	
	public void hello5(String str){
		ArrayList<Character> list = new ArrayList<Character>();
		for (int i = 0; i< str.length(); i++){
			list.add(str.charAt(i));
		}
		for(int i = 0; i < str.length(); i++){
		System.out.print(list.get(i));
		}
		System.out.print("\n");
		return;
	}
	
	public static void main(String[] args) throws InterruptedException{
		HelloWorld run = new HelloWorld("3"); 
		String string = "Hello World!";
		//run.hello1();
		run.hello4(string);
		run.hello5(string);
		return;
	}
	
}
