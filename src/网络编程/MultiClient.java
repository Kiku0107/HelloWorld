package ������;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MultiClient {

	public MultiClient() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public static void main(String[] args) {
		try {
			Socket s=new Socket("127.0.0.1",8888);
			new SendThread(s).start();
			new RecieveThread(s).start();
		} catch (UnknownHostException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}// TODO �Զ����ɵķ������

	}

}
