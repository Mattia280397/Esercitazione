package tvPack;

import java.util.Scanner;

import java.util.logging.Logger;
import java.util.InputMismatchException;

public class TVClass {
	int Channel=0;
    final static Logger logger = Logger.getLogger(TVClass.class);
	TVClass TVObj=new TVClass();
	public static void main(String[] args) {
		TVObj.PrintChannel(Channel);
		logger.info(TVObj(PrintChannel(Channel)));
	}
	static void PrintChannel(int Channel) {
		System.out.println("Il Canale è "+Channel);
		try {
			logger.info(TVObj.ChangeChannel());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static void ChangeChannel() {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Cambia Canale ");
		 int NewChannel = scanner.nextInt();
		 System.out.println("Il Canale è "+NewChannel);
	}
}
