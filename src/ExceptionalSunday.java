public class ExceptionalSunday {

	public static void main(String[] args) {
		
		int day=1;
		int[] numberOfDaysInMonths = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		for(int year=1900;year<=2000;year++){
			if(isLeapYear(year)) numberOfDaysInMonths[1]=29;
			else numberOfDaysInMonths[1]=28;
			for(int month=0;month<12;month++){
				day = day + numberOfDaysInMonths[month];
				if(day%7==0) System.out.println("1." + (month+2) + "." + year);
				//We have two reason for calculate month+2 : 
				// 1- We add numberOfDaysInMonths[month] for take next month (+1), 
				// 2- Index starts with 0 (+1).
			}
		}	
	}
	
	public static boolean isLeapYear (int year){
	    if ((year%4==0 && year%100!=0) || (year%400==0)) return true;
	    else return false;		    	   	  	   
	}	
}
