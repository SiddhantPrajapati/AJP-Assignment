// Client server program using tcp where client sends 2 numbers and server respond sum of them
import java.util.*;
import java.net.*;
import java.io.*;

public class SumTcpClient {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// include Socket class
		Socket s = new Socket("localhost",3333);
		
		//make object of datainput Stream and dataoutputstream
		DataInputStream dis = new DataInputStream(s.getInputStream()); // read primitive data
		DataOutputStream dos = new DataOutputStream(s.getOutputStream()); // write " "
		
		String str = "";
		String str2 = "";
		
		while(!str.equals("stop")) {
			str = sc.nextLine();
			
			dos.writeUTF(str);
			dos.flush();
			
			str2 = dis.readUTF();
			System.out.println("Server says=" + str2);
		}
		dos.close();
		s.close();
	}
}