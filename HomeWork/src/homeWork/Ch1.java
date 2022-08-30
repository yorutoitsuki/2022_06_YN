package homeWork;

import java.util.ArrayList;
import java.util.Scanner;

class Calc{
	ArrayList<Double> calList;
	ArrayList<String> operator;
	Calc(){
		super();
		calList = new ArrayList<Double>();
		operator = new ArrayList<String>();
	}
	void addNumber(double number) {
		calList.add(number);
	}
	void addOper(String oper) {
		operator.add(oper);
	}
}

public class Ch1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String wantCalc = sc.nextLine();
		int pointer = 0;
		for(int i = 0; i < wantCalc.length(); i++) {
			char checker = wantCalc.charAt(i);
			if(checker == '+'||checker == '-'||checker == '*'||checker == '/') {
				
			}
		}
	}

}
