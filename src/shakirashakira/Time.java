package shakirashakira;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	// constructors
	public Time(){
		int totalSeconds;
		int totalMinutes;
		int totalHours;
		totalSeconds = (int)(System.currentTimeMillis()/1000);
		this.second= totalSeconds%60;
		totalMinutes = totalSeconds/60;
		this.minute= totalMinutes%60;
		totalHours = totalMinutes/60;
		this.hour = totalHours%24;
	}
	public Time(long elapseTime){
		int totalSeconds, totalMinutes, totalHours;
		totalSeconds = (int)(elapseTime/1000);
		this.second=totalSeconds%60;
		totalMinutes= totalSeconds/60;
		this.minute=totalMinutes%60;
		totalHours= totalMinutes/60;
		this.hour=totalHours%24;
	}
	public Time(int hour, int minute, int second){
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	// get functions
	public int getHour(){
		return hour;
	}
	
	public int getMinute(){
		return minute;
	}
	
	public int getSecond(){
		return second;
	}
	// set function
	public void setTime(long elapseTime){
		second=(int)(elapseTime/1000);
		minute=(int)(elapseTime/60000);
		hour=(int)(elapseTime/3600000);
	}
	public void toMilitary(){
		System.out.println(hour + ":" + minute + ":" + second);
	}
	public void toStandard(){
		if (hour > 12){
			System.out.println(hour/2 + ":" + minute + ":" + second);
		} else {
			this.toMilitary();
		}
	}
	public String toString(){
		String result =  "this is a clock, which holds integers hour, minute and second." + "\n that is the current time^";
		this.toMilitary();
		return result;
	}

}
