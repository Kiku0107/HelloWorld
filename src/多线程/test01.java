package ���߳�;

class TicketRunnable implements Runnable{
	private int Ticket =50;

	public int getTicket() {
		return Ticket;
	}

	public void setTicket(int ticket) {
		Ticket = ticket;
	}

	@Override
	public void run() {
		while(true) {
			if(Ticket>0) {
				System.out.println(Thread.currentThread().getName()+"ʣ��"+Ticket);
				Ticket--;
			}else {
				break;
			}
		}
		/*for(int i =1;i<51;i++) {
			System.out.println("����һ������"+i+"��Ʊ��"+"ʣ��"+(this.getTicket()-i)+"��");
		}*/
		// TODO �Զ����ɵķ������
		
	}
	
}
class TicketThread extends Thread{
	private int Ticket =50;

	public int getTicket() {
		return Ticket;
	}

	public void setTicket(int ticket) {
		Ticket = ticket;
	}

	@Override
	public void run() {
		for(int i =1;i<51;i++) {
			
			System.out.println("                                                        ���ڶ�������"+i+"��Ʊ��"+"ʣ��"+(this.getTicket()-i)+"��");
		}
		
	}
	
}

public class test01{

	public static void main(String[] args) {
		TicketRunnable tr = new TicketRunnable();
		TicketRunnable tr1 = new TicketRunnable();
		Thread trt = new Thread(tr);
		Thread trt1 = new Thread(tr1);
		//TicketThread tt= new TicketThread();
		//tt.start();
		trt.start();
		trt1.start();
		/*for(int i =0;i<50;i++) {
			System.out.println("kiku");
		}*/
	

}
}
