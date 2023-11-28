package com.isimOdevi.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {
	public static void toplama(int a,int b,int c){
		System.out.println("toplmları = " +  (a+b+c));
	}
	public static void selamlama(String isim) {
		System.out.println("selam " + isim);
	}
	public static void main(String[] args) {
		/*("murat");
		//SpringApplicatin.run(DemoApplication.class, args);*/
		toplama(3,2,5);
	}
//burada github uygulaması kullanıldı

}
