package myPack2;
import java.io.*;
import static java.lang.System.out;
import myPack.*;
class PackDemo{
	public static void main(String[] args){
		myPack.A obj = new myPack.A();
		obj.disp();

		myPack.B obj1 = new myPack.B();
		obj1.disp2();
		
		myPack.C obj2 = new myPack.C();
		obj2.disp3();

		myPack.D obj3 = new myPack.D();
		obj3.disp4();

		E obj4 = new E();
		obj4.disp5();
		
	}
}