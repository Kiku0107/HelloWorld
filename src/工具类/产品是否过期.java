package ������;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ��Ʒ�Ƿ���� {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ʒ���������ڣ�(yyyy-MM-dd)");
		String birth_date = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date birthDate;
		try {
			birthDate=sdf.parse(birth_date);
			System.out.println("���������Ʒ�ı����ڣ��죩��");
			int day = sc.nextInt();
			Date dateNowDate = new Date();
			System.out.println("���������Ϊ"+sdf.format(dateNowDate));
			Calendar c = Calendar.getInstance();
			c.setTime(birthDate);
			c.add(c.DATE, day);
			Date releaseDate = c.getTime();
			
			long days = (releaseDate.getTime()-dateNowDate.getTime())/(24*60*60*1000);		
			if (days <0) {
				System.out.println("��Ʒ�Ѿ����ڣ�");
				
			}
			else {
				System.out.println("����"+days+"�����");
			}
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
		// TODO �Զ����ɵķ������

	}

}
