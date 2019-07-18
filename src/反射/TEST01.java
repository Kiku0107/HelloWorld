package ����;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Hero{
	public int id;
	public String name;
	public int age;
	
	public Hero() {
		super();
	}

	public Hero(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	static String copyright;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static String getCopyright() {
		return copyright;
	}

	public static void setCopyright(String copyright) {
		Hero.copyright = copyright;
	}
	
	
	
}
class ClassUtil{
	public static void  printCLassFieldMessage(Object object) {
		Class c = object.getClass();
		Field[] fs = c.getDeclaredFields();
		for(Field field :fs) {
			//�õ���Ա����������
			Class fieldType = field.getType();
			String typename = fieldType.getName();
			String fieldName = field.getName();
			System.out.println("fieldtype:  "+fieldType);
			System.out.println("typename: "+typename);
			System.out.println("fieldname:"+fieldName);
			
		}
	}
	public static void printClassConstructor(Object object) {
		Class c = object.getClass();
		Constructor[] cs = c.getConstructors();
		Constructor[] cz = c.getDeclaredConstructors();
		for(Constructor x:cz) {
			System.out.println("�ù��캯��Ϊ"+x.getName());
			Class[] paramType = x. getParameterTypes();
			System.out.println("�ù��캯���Ĳ����б�Ϊ��");
			for(Class m:paramType) {
				System.out.print(m.getName()+",");
			}
			System.out.println("");
		}
		
		
	}
}


public class TEST01 {

	
	public static void main(String[] args) {
		Hero hero = new Hero();
		try {
			Class pClass = Class.forName("java����.Hero");
			Field f1= pClass.getDeclaredField("name");
			f1.set(hero, "kiku");
			System.out.println(hero.name);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
		/*try {
			Class clazz = Class.forName("java����.Hero");
			Constructor con = clazz.getConstructor();
			Hero h1 = (Hero) clazz.newInstance();
			h1.name= "kiku";
			System.out.println(h1.name);
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		*/
		
		
		
		
	
		
		/*String str = "helloworld";

		Class clazz = str.getClass();*/

		
		/*Hero hero = new Hero(); 
		Class clazz = hero.getClass();

		Method m;
		Method n;
		try {
			m = clazz.getMethod("setName", String.class);
			n = clazz.getMethod("getName");
			
			m.invoke(hero,"kiku");
			
			System.out.println(n.invoke(hero));
		} catch (NoSuchMethodException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}*/
		
		
		
//		String s ="hello";
//		ClassUtil.printClassConstructor(new Integer(9));
		/*String classname = "java����.Hero";
		try { 
			Class pClass = Class.forName(classname);
			Class pClass1 = Hero.class;
			Class pClass2 = new Hero().getClass();
			if(pClass==pClass1) {
				if(pClass == pClass2) {
					System.out.println(true);
				}
			}
			Method[] ms = 
		} catch (Exception e) {
			// TODO: handle exception
		}
		// TODO �Զ����ɵķ������*/

	}

}
