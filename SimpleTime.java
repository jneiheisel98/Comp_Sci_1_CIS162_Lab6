
/**
 * Write a description of class SimpleTime here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SimpleTime {
    // instance variables - replace the example below with your own
    private int hours;
    private int minutes;
    private int seconds;
    private String time;
    /**
     * Constructor for objects of class SimpleTime
     */
    //do not put any void in the below

    public SimpleTime() {
        hours = 0;
        minutes = 00;
        seconds = 00;
    }

    public SimpleTime(int h, int m, int s) {
        hours = h;
        minutes = m;

        seconds = s;
    }

    public boolean isMidnight(){
        if (hours == 0 && minutes == 0 && seconds == 0){
            return true;
        }else{

            return false;
        }

    }

    public boolean isNoon() {
        if (hours == 12 && minutes == 0 && seconds == 0){
            return true;
        }else{

            return false;
        }
    }

    public boolean isLunchTime() {
        if ((hours == 12 && (minutes>= 0||minutes<=59) && (seconds>= 0||seconds<=59))||(hours == 13 && (minutes==0) && (seconds==0))){
            return true;
        }else{

            return false;
        }    
    }

    public String toString() {
        if(seconds < 10&&minutes<10){
            time = hours+":"+"0"+minutes+":"+"0"+seconds;
        }else if(minutes < 10){
            time = hours+":"+"0"+minutes+":"+seconds;
        }else if(seconds<10){
            time = hours+":"+minutes+":"+"0"+seconds;
        } else{ 
            time = hours+":"+minutes+":"+seconds;
        }
        return time;
    }

    public void increment() {
        seconds++;
        if(seconds >59){
            minutes++;
            seconds = 0;
        }
        if(minutes >59){
            hours++;
            minutes = 0;
        }
        if(hours >=24){
            hours = 0;
        }
    }

    public int secondsElaspsed(SimpleTime start) {
        int hoursStart = start.hours*3600;
        int minutesStart = start.minutes*60;
        int secondsStart = start.seconds;
        int timeStart = hoursStart+minutesStart+secondsStart;
        int hoursEnd = this.hours*3600;
        int minutesEnd = this.minutes*60;
        int secondsEnd = this.seconds;
        int timeToCompare = hoursEnd+minutesEnd+secondsEnd;
        int timeDiff = timeToCompare-timeStart;
        return timeDiff;
    }
}
