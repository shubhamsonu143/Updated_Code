import java.util.Scanner;

public class BCL_Calculator {
	
	public static void main(String[] args) {

		System.out.println("Enter user's " + " Annual Turnover " + ": ");
		Scanner s = new Scanner(System.in);
		int Annual_Turnover = s.nextInt();
		System.out.println("Your " + " Annual Turnover " + " is " + Annual_Turnover);

		System.out.println("Enter user's " + " Profit Margin " + ": ");
		int Profit_Margin_Declared = s.nextInt();
		double coverted = Profit_Margin_Declared;
		System.out.println("User's " + " Profit Margin " + " is " + coverted);

		int a = 4000000;
		int b = 10000000;
		int c = 30000000;

		int fourtylacs_to_onehundredLacs = 50;
		int onehundredLacs_to_threehundredLacs = 55;
		int above_threehundredLacs = 60;
		
		
		double divide = 100;
		double max_Manufacturing_Percent = 15;
		double max_Service_Percent = 17;
		double max_Trading_Percent = 7;

		System.out.println(max_Manufacturing_Percent / divide);

		// double[] array = {0.15,0.17,0.07};

		if (Annual_Turnover >= a && Annual_Turnover <= b) {

			System.out.println(fourtylacs_to_onehundredLacs + "%");
			if (coverted / divide >= max_Manufacturing_Percent / divide) {

				System.out.println(max_Manufacturing_Percent / divide);

				double formula = ((Annual_Turnover * Math.min(max_Manufacturing_Percent / divide, coverted / divide)) / 12);

				System.out.println(formula);
				
				int Net_Disposable_Income = (int) (formula * fourtylacs_to_onehundredLacs / divide);

				System.out.println(Net_Disposable_Income);
			}

			else if (coverted/divide < max_Manufacturing_Percent/divide) {

				System.out.println(coverted/divide);

				double formula = ((Annual_Turnover * Math.min(max_Manufacturing_Percent, coverted)) / 12);

				System.out.println(formula);

				int Net_Disposable_Income = (int) (formula * fourtylacs_to_onehundredLacs / divide);

				System.out.println(Net_Disposable_Income);
			}


		} else if (b <= Annual_Turnover && c >= Annual_Turnover) {

			System.out.println(onehundredLacs_to_threehundredLacs + "%");

		}

		else if (Annual_Turnover > c) {

			System.out.println(above_threehundredLacs + "%");
		}

		else {

			System.out.println("Entered amount is " + Annual_Turnover + " is lower than " + a);
		}

	

//		if (coverted / divide >= max_Manufacturing_Percent / divide) {
//
//			System.out.println(max_Manufacturing_Percent / divide);
//
//			double formula = ((Annual_Turnover * Math.min(max_Manufacturing_Percent / divide, coverted / divide)) / 12);
//
//			System.out.println(formula);
//			
//			int Net_Disposable_Income = (int) (formula * fourtylacs_to_onehundredLacs / divide);
//
//			System.out.println(Net_Disposable_Income);
//		}
//
//		else if (coverted/divide < max_Manufacturing_Percent/divide) {
//
//			System.out.println(coverted/divide);
//
//			double formula = ((Annual_Turnover * Math.min(max_Manufacturing_Percent, coverted)) / 12);
//
//			System.out.println(formula);
//
//			int Net_Disposable_Income = (int) (formula * fourtylacs_to_onehundredLacs / divide);
//
//			System.out.println(Net_Disposable_Income);
//		}

		// (A*Min(C,D))/12

		// double formula = ((Annual_Turnover * Math.min(Annual_Turnover,coverted))/12)
		// ;

		// System.out.println(formula);
		
		//================================================
		
		
	}

}
