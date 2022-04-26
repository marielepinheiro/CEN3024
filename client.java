	import java.io.*;
	import java.net.*;
	import java.util.Scanner;

	public class client {
	   public static void main(String[] args) {
	       Scanner scan = new Scanner(System.in);
	       try{
	           Socket s=new Socket("localhost",8080);
	           DataInputStream dis=new DataInputStream(s.getInputStream());
	           DataOutputStream dout=new DataOutputStream(s.getOutputStream());

	           // USER INPUT
	           System.out.print("\n Number is: ");
	           int num = scan.nextInt();
	           // WRITING INTEGER
	           dout.writeInt(num);
	           String ans = (String)dis.readUTF();
	           System.out.println("\n Number "+num+
	                               " Is Prime Number: "+ans);
	           dout.flush();
	           dout.close();
	           s.close();
	       }
	       catch(Exception e){
	           System.out.println(e);
	       }
	       scan.close();
	   }
	}

