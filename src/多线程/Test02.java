package ���߳�;


class T1 extends Thread{
	private boolean timeOut = false;
	public void run() {
		for(int i = 0;i<20;i++) {
		System.out.println("-------T1---------");}
	}
	public void stopThread1() {
		timeOut = true;
	}
}
class T2 extends Thread{
	public void run() {
		for(int i = 0;i<20;i++) {
			System.out.println("-------T2---------");}
	}
}

public class Test02 extends Thread {

	public static void main(String[] args) {
		T1 t1=new T1();
		T2 t2=new T2();
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		System.out.println("t1���ȼ�"+t1.getPriority());
		System.out.println("t2���ȼ�"+t2.getPriority());
		// TODO �Զ����ɵķ������

	}

}
