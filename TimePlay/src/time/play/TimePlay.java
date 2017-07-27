package time.play;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimePlay {

  public static void main( String[] args ) throws ParseException {
    DateFormat timeFormat = new SimpleDateFormat( "hh:mm:ss" );
    Date date1 = timeFormat.parse( "5:30:00" );
    Date date2 = timeFormat.parse( "15:35:00" ); // 3:5:0
    long totalMilliSeconds = 0;
    totalMilliSeconds = ( date2.getTime() + date1.getTime() ) + ( 7200000 * 2 );
    printRealTime( totalMilliSeconds );
  }

  public static void printRealTime( long totalMilliseconds ) {
    int totalSeconds = (int) ( totalMilliseconds / 1000 );
    int hour, minutes;
    hour = totalSeconds / 3600;
    totalSeconds -= ( 3600 * hour );
    minutes = totalSeconds / 60;
    totalSeconds -= ( minutes * 60 );
    System.out.println( "\nReal Time : " + hour + ":" + minutes + ":" + totalSeconds );
  }
}
