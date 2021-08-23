package practice;

public class MyDate {
	private int day;
	private int month;
	private int year;
	public boolean isValid = true;
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
			switch(month) {
				case 2 : if(day > 29 || day <1) {
					isValid = false;
				}else {
					this.day = day;
				}
				break;
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					if(day > 31 || day < 1) {
						isValid = false;
					}else {
						this.day = day;
					}
					break;
				 case 4: case 6: case 9: case 11:
					 if(day > 30 || day < 1) {
						 isValid = false;
						}else {
							this.day = day;
						}
					 break;
				default : isValid = false;
			}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month > 12 || month < 1) {
			isValid = false;
		}else {
			this.month = month;
		}
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public MyDate(int day, int month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day);
	};
	
	public String isValid() {
		if(isValid) {
			return "유효한 날짜";
		}else {
			return "유효하지 않은 날짜";
		}
		
	}
		
};
	
