package ������;



import java.io.*;
import java.net.*;

public class NetTest02 {
	public static void main(String[] args) throws MalformedURLException {
		try {
			ServerSocket ss = new ServerSocket(6666);
			Socket socket =ss.accept();
			System.out.println("�����ӹ���"+socket);
			socket.close();
			ss.close();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		/*URL url1 = new URL("http://www.baidu.com");
		URL url = new URL(url1,"/index.html?username = kiku");
		System.out.println(url.getProtocol());
		System.out.println(url.getHost());
		System.out.println(url.getPort());
		System.out.println(url.getPath());
		*/
	}

}
