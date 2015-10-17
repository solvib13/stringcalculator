package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		else if(text.startsWith("//")){
			String delim = text.substring(2,3);
			return sum(text.substring(4).split(delim));
		}
		else if(text.contains(",") || text.contains("\n")){
			return sum(splitNumbers(text));
		}
		else
			return 1;
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers){
	    	return numbers.split("[\\n,]+");
	}
      
    	private static int sum(String[] numbers){
 		int total = 0;
		String err = "Negatives not allowed: ";
        	for(String number : numbers){
			if(toInt(number)<=1000) {
				total += toInt(number);
			}
			if(toInt(number)<0) {
			err += number + ", ";
			}
		}
		if(err.length()>23) {
			throw new IllegalArgumentException(err.substring(0,err.length()-2));
		}
		return total;
	}
}
