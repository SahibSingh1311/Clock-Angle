import java.util.*;
											//m->60 mins => 360deg
public class ClockAngle{								//1 min => 360/60 =6deg
public static void main(String[] args){							//h->12 hrs =>360deg
	int hour=3, minute=0;								//1 min => 360/60*12 = 0.5 deg
	System.out.println(calcAngle(hour,minute));						//	     ^   ^
}											//	    min  hour
static int calcAngle(int h, int m){
	if(h>12||m>60||h<0||m<0){
		System.out.println("Incorrect Input!!");
	}
	if(h==12)
		h=0;
	if(m==60){
		m=0;
		h++;
		if(h>12)
			h-=12;
	}
	
	int minuteAngle = 6*m;
	int hourAngle = (int)(0.5*(h*60+m));

	int angle= minuteAngle>hourAngle ? minuteAngle-hourAngle: hourAngle-minuteAngle;
	
	return angle; 
}

}