
package ������;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer {

	public MultiServer() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public static void main(String[] args) {
		try {
			ServerSocket ss=new ServerSocket(8888);
			System.out.println("�����ڶ˿ں�6666");
			Socket s=ss.accept();
			new SendThread(s).start();
			new RecieveThread(s).start();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}// TODO �Զ����ɵķ������

	}

}
