package ������;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetTest01 {
	public static void main(String[] args) {
		try {
			InetAddress address = InetAddress.getLocalHost();//��ȡ������inetʵ��
		    System.out.println(address.getHostName());
		    System.out.println(address.getHostAddress());
		    byte[] bytes = address.getAddress();
		    System.out.println(address);
		    
		    
		    
		    
		    
		} catch (UnknownHostException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
	}

}
