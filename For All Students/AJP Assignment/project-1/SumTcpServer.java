import java.util.*;
import java.net.*;
import java.io.*;

public class SumTcpServer {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(3333);
		Socket s = new Socket();
		DataInputStream dis = new DataInputStream(s.getInputStream()); // read primitive data
		DataOutputStream dos = new DataOutputStream(s.getOutputStream()); // write " "
		
		Scanner sc = new Scanner(System.in);
		String str = "",str2 = "";
		while(!str.equals("stop")){
			str=dis.readUTF();
			System.out.println("Client says= " + str);
			str2 = sc.nextLine();
			dos.writeUTF(str2);
			dos.flush();
		}
		dis.close();
		s.close();
		ss.close();
	}
}