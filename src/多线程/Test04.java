package ���߳�;

import java.text.SimpleDateFormat;
import java.util.Date;

class DeadlockThread1 extends Thread{
	private Object obj1;
	private Object obj2;
	public DeadlockThread1(Object obj1, Object obj2) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	public void run() {
		synchronized (obj1) {
			System.out.println("�߳�1����obj1���ȴ�obj2");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			
			synchronized (obj2) {
				System.out.println("�߳�1����obj2���������");
				
			}
		}
		
		
	}
}
class DeadlockThread2 extends Thread{
	private Object obj1;
	private Object obj2;
	public DeadlockThread2(Object obj1, Object obj2) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	public void run() {
		synchronized (obj2) {
			System.out.println("�߳�2����obj2���ȴ�obj1");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			
			synchronized (obj1) {
				System.out.println("�߳�2����obj1���������");
				
			}
			
		}
		
		
	}
}


/*class ThreadTest extends Thread{
	public void run() {
		for(int i=0;i<200;i++) {
		System.out.println(Thread.currentThread().toString()+"��������");}
	}
}*/



public class Test04 extends Thread{
public static void main(String[] args) {
	/*while(true) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}*/
	
	
	
	/*ThreadTest t1= new ThreadTest();
	ThreadTest t2= new ThreadTest();
	t1.setPriority(Thread.MAX_PRIORITY);
	t2.setPriority(6);
	t1.start();
	t2.start();*/
	
	
	
	
	Object obj1= new Object();
	Object obj2= new Object();
	
	DeadlockThread1 thread1= new DeadlockThread1(obj1, obj2);
	DeadlockThread2 thread2= new DeadlockThread2(obj1, obj2);
	thread1.start();
	thread2.start();
	
	
}
}
