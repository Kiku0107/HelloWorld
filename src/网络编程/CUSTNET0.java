package ������;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;



public class CUSTNET0 {

	public static void main(String[] args) {
		try {
			Socket s = new Socket("127.0.0.1",8888);
			
			//DataOutputStream oStream =new DataOutputStream( s.getOutputStream());
			/*Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();*/
			OutputStream os = s.getOutputStream();
			PrintWriter pWriter = new PrintWriter(os);
			
			pWriter.write("�û���Alice;����134");
			pWriter.flush();
			
			s.shutdownOutput();
			
			InputStream iStream  =s.getInputStream();
			BufferedReader bReader = new BufferedReader(new InputStreamReader(iStream));
			String info = "";
			while((info = bReader.readLine())!= null){
				System.out.println("������˵��"+info);
			}
			pWriter.close();
			os.close();
			bReader.close();
			iStream.close();
			s.close();
		}catch (UnknownHostException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		catch (IOException e) {
			// TODO: handle exception
		}


	}

}
