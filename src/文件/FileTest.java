package �ļ�;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class FileTest {

	public static void main(String[] args) {
		File f = new File("D:/java/����ʵѵ/java001.txt");
		File[] aFiles = f.listRoots();
		System.out.println(Arrays.toString(aFiles));
		f.delete();
		//f.mkdirs();
		
		
		/*String[] strings = f.list();
		System.out.println(Arrays.toString(strings));
		File[] f1 = f.listFiles();
		System.out.println(Arrays.toString(f1));
		String parentStr = f.getParent();
		System.out.println(parentStr);
		*/
		
		
		/*File  f1=new File("D:/filetest");
		System.out.println(f1.getAbsolutePath());
		File f2=new File("java001.txt");
		System.out.println(f2.getAbsolutePath());
		File f3 = new File(f1,"java002.txt");
		System.out.println(f3.getAbsolutePath());
		
		File f= new File("D:\\java\\����ʵѵ\\java001.txt");
		System.out.println("��ǰ�ļ���"+f);
		System.out.println("�ж��Ƿ����"+f.exists());
		System.out.println("�ж��Ƿ����ļ���"+f.isDirectory());
		System.out.println("�ж��Ƿ����ļ�"+f.isFile());
		System.out.println("�ļ�����"+f.length());
		long time = f.lastModified();
		Date date = new Date(time);
		System.out.println(date);
		f.setLastModified(0);
		
		File fn=new File("D:\\java\\����ʵѵ\\java001.txt");
		f.renameTo(fn);*/

	}

}
