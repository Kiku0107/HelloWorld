package ������;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;



public class RecieveThread extends Thread{
	private Socket s;
	public RecieveThread(Socket s) {
		this.s=s;
		// TODO �Զ����ɵĹ��캯�����
	}
	public void run() {
		InputStream is=null;
		DataInputStream dis=null;
		try {
			is=s.getInputStream();
			dis=new DataInputStream(is);
			while(true) {
				String msg=dis.readUTF();
				System.out.println("���յ���"+msg);
			}
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			try {
				dis.close();
				is.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
