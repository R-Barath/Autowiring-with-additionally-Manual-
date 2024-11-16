package in.barath.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.barath.beans.Atm;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
//calling r=targer class obj 
Atm atm= context.getBean(Atm.class);
atm.withdraw();
	}

}
