package Ա����ϵͳ;

import java.util.*;

public class Company {
	
	ArrayList<Employee> empList = new ArrayList<Employee>();
	ArrayList<DakaInfo> dakalist = new ArrayList<DakaInfo>();
	
	public void addEmployee(Employee e) {
		empList.add(e);	
		DakaInfo info = new DakaInfo(e, null, null);
		dakalist.add(info);
		System.out.println("���Ա��"+e.toString()+"�ɹ�");
	}

	public void delEmployee(int id) {
		Iterator<Employee> iterator = empList.iterator();
		while (iterator.hasNext()) {
			Employee e = iterator.next();
			if (e.getID() == id) {
				int index = empList.indexOf(e);
				iterator.remove();
				System.out.println("ɾ��Ա��" + e.toString() + "�ɹ�");
			}
		}

	}
	public void seekEmployee(int id) {
		Iterator<Employee> iterator = empList.iterator();
		while(iterator.hasNext()) {
			Employee e = iterator.next();
			if(e.getID() == id) {
				System.out.println("��Ա��Ϊ:"+e.getName());
			}
		}
	}
	public void showInfo() {
		Iterator<Employee> i = empList.iterator();
		System.out.println("����Ա������ϢΪ");
		while(i.hasNext()) {
			System.out.println(i.next().toString());
		}
	}
	/*public void Signin() {
		DakaInfo info = new DakaInfo();
		int id = new Scanner(System.in).nextInt();
		Iterator<Employee> iterator = empList.iterator();
		while(iterator.hasNext()) {
			Employee e = iterator.next();
			if(e.getID() == id) {
				info.setEmployee(e);
				info.qiandao();
			}
		}
		dakalist.add(info);
		
	}
	public void SignOut() {
		DakaInfo info = new DakaInfo();
		int id = new Scanner(System.in).nextInt();
		Iterator<Employee> iterator = empList.iterator();
		while(iterator.hasNext()) {
			Employee e = iterator.next();
			if(e.getID() == id) {
				info.setEmployee(e);
				info.qiantui();
			}
		}
		dakalist.add(info);
		
	}*/

}
