package Ա����ϵͳ;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Company company = new Company();
		
		
		
		
		
		
		
		System.out.println("****Ա������******");

		boolean flag = true;
		while (flag) {

			System.out.printf("������Ա\t1\nɾ����Ա\t2\n������Ա\t3\n��ʾԱ����Ϣ\t4\n�˳�ϵͳ\t0\n");
			int cmd = new Scanner(System.in).nextInt();
			switch (cmd) {
			case 1:
				System.out.print("������Ҫ��ӵ�Ա������:");
				int id = new Scanner(System.in).nextInt();
				System.out.print("������Ҫ��ӵ�Ա������:");
				String nameString = new Scanner(System.in).nextLine();
				company.addEmployee(new Employee(id, nameString));
				break;
			case 2:
				try{
					System.out.println("������Ҫɾ����Ա���˺�");
					int id1 = new Scanner(System.in).nextInt();
			        company.delEmployee(id1);
			        }
				catch (ConcurrentModificationException e) {
					e.printStackTrace();
				}
				break;
			case 3:
				int id2 = new Scanner(System.in).nextInt();
				company.seekEmployee(id2);
				break;
			case 4:
				company.showInfo();
				break;
			case 0:
				flag = false;
				break;
			default:
				break;
			}
		}

		System.out.println("----Ա����ϵͳ- - - -");

		boolean temp = true;
		while (temp) {

			System.out.println("����0--------�˳�");
			System.out.println("����1--------ǩ��");
			System.out.println("����2--------ǩ��");
			System.out.println("����3--------�鿴ǩ��ǩ����Ϣ");
			System.out.println("����4--------�洢��Ϣ");
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			switch (x) {
			case 0:
				temp = false;
				System.out.println("system exit!");
				break;
			case 1:
				System.out.println("������ǩ��Ա��ID��");
				int id = new Scanner(System.in).nextInt();
				// ���ǩ��ʱ��
				Date date = new Date();
				Calendar c1 = Calendar.getInstance();
				Calendar c2 = Calendar.getInstance();
				c1.setTime(date);
				Iterator<DakaInfo> ite = company.dakalist.iterator();

				boolean r = true;
				if (r) {
					while (ite.hasNext()) {

						DakaInfo info1 = ite.next();
						if (info1.check) {
							if (info1.employee.getID() == id) {
								info1.qiandao();
								info1.flag = true;
								System.out.println("����" + info1.employee.getID() + "ǩ���ɹ�");
								info1.check = false;
							}
						} else {
							c2.setTime(info1.getdakaTime());
							if ((c1.get(c1.DATE) - c2.get(c2.DATE)) < 1) {
								System.out.println("ͬһ�첻�ܶ��ǩ��");
							} else {
								if (info1.employee.getID() == id) {
									info1.qiandao();
									info1.flag = true;
									System.out.println("����" + info1.employee.getID() + "ǩ���ɹ�");
								}
							}
						}

					}

				} else {
					System.out.println("û�д�Ա��");
				}

				break;
			case 2:
				System.out.println("������ǩ��Ա��ID��");
				int id1 = new Scanner(System.in).nextInt();
				Iterator<DakaInfo> ite1 = company.dakalist.iterator();
				while (ite1.hasNext()) {
					DakaInfo info2 = ite1.next();
					if (info2.employee.getID() == id1) {
						if (info2.flag) {
							info2.qiantui();
							System.out.println("����" + info2.employee.getID() + "ǩ�˳ɹ�");
						} else {
							System.out.println("���Ƚ���ǩ����");
						}
						break;
					}
				}

				break;
			case 3:
				Iterator<DakaInfo> ite2 = company.dakalist.iterator();
				while (ite2.hasNext()) {
					System.out.println(ite2.next().toString());
				}
				break;
			case 4 :
				File file = new File("D:/abc.txt");
				Iterator<DakaInfo> ite3 = company.dakalist.iterator();
				FileWriter fWriter = null;
				try {
					fWriter = new FileWriter(file);
					while(ite3.hasNext()) {
						fWriter.write(ite3.next().toString());
						
					}
					
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
				finally {
					try {
						fWriter.flush();
						fWriter.close();
						System.out.println("sucess");
					} catch (IOException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
				}
				

			default:
				break;
			}

		}

	}

}
