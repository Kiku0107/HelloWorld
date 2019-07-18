package ������;

import java.io.*;
import java.net.*;

public class ServerThread extends Thread {
	Socket socket = null;

	public ServerThread(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		InputStream iStream =null;
		InputStreamReader isReader = null;
		BufferedReader bReader = null;
		OutputStream oStream =null;
		PrintWriter pWriter =null;
		try {
			
			iStream = socket.getInputStream();
			isReader = new InputStreamReader(iStream);
			bReader = new BufferedReader(isReader);
			
				Thread.sleep(1000);
				System.out.println("�߳�");
				String info1 = "";
				while ((info1 = bReader.readLine()) != null) {
					System.out.println("--------");
					System.out.println("�ͻ���˵��" + info1);
				}
				socket.shutdownInput();

				oStream = socket.getOutputStream();
				pWriter = new PrintWriter(oStream);
				pWriter.write("��ӭ��");
				pWriter.print(info1);
				pWriter.flush();
			
			
				}
		 catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		finally {
			try {
				if(null!=pWriter) {
					pWriter.close();
				}
				if(null != oStream) {
					oStream.close();
				}
				if(null != bReader) {
					bReader.close();
				}
				if(null != isReader) {
					isReader.close();
				}
				if (null != iStream) {
					iStream.close();
					
				}
				if(null != socket) {
					socket.close();
				}
			} catch (IOException e2) {
				e2.printStackTrace();
				// TODO: handle exception
			}
		}
	}
}

