
/**
 * MAMAN 11 -Yona Goncharov
 * ID: 312631187 
 * 
 */
public class Date
{      //instance variables
    private int _day, _month, _year;
    private final int DEFAULT_VAL=0, DEFAULT_DAY_MONTH=1, DEFAULT_YEAR=2000;
    private final int MAX_DAY=31, MAX_MONTH=12, MIN_YEAR=1000, MAX_YEAR=9999;
    
    //constructors
    /**
     * creates a new Date object if the date is valid, otherwise creates the date 1/1/2000
     * @param day The day of the date.
     * @param month The month of the date.
     * @param year The year of the date.
     */
   

    public Date(int day, int month, int year) {
      
      if((day>DEFAULT_VAL && day<=MAX_DAY) && (month>DEFAULT_VAL && month<=MAX_MONTH)
        && (year>=MIN_YEAR && year <= MAX_YEAR))
        {
            _day=day;
            _month=month;
            _year=year;
        }
        else
        {
            _day=DEFAULT_DAY_MONTH;
            _month=DEFAULT_DAY_MONTH;
            _year=DEFAULT_YEAR;
        }
    
    }
    
     
    
    /**
     * Copy constructor for a Date object.
     * Construct a Date object with the same attributes as another Date object.
     * @param other The date object from which to construct the new Date.
     */
    
    public Date(Date other){
        _day = other._day;
        _month = other._month;
        _year = other._year;
    }
     /**
     * gets the year.
     * @return The year of the date.
     */
    public int getYear(){
        return _year;
    }
    
     /**
     * gets the month.
     * @return The month of the date.
     */
    public int getMonth(){
        return _month;
    }
    /**
     * gets the day.
     * @return The day of the date.
     */
    public int getDay(){
        return _day;
    }
    
    /** sets the year
     * @param yearToSet the value to be set
     */
    public void setYear(int yearToSet){
          if(yearToSet>=MIN_YEAR && yearToSet <= MAX_YEAR)
            _year=yearToSet;
        else
            _year=DEFAULT_YEAR;
    }
    
    
    /** set the month
     * @param monthToSet the value to be set
     */
    public void setMonth(int monthToSet){
        if(monthToSet>DEFAULT_VAL && monthToSet<=MAX_MONTH)
            _month=monthToSet;
        else
            _month=DEFAULT_DAY_MONTH;
    }
    
    
    /** sets the day 
     *  @param dayToSet the value to be set
     */
    public void  setDay(int dayToSet){
      if(dayToSet>DEFAULT_VAL && dayToSet<=MAX_DAY)
            _day=dayToSet;
        else
            _day=DEFAULT_DAY_MONTH;
    
    }
 /**
     * check if 2 dates are the same.
     * @param other The date to be compared with this date.
     * @return True if the received date is equal to this time.
     */
    
    public boolean equals(Date other)
    {
       return other._day==_day && other._month==_month && other._year==_year; 
    }
    
    /**
    * checks if this date comes before a given date
    * @param date2 the given date
    * @retun true iff this date comes before date2
    */

    public boolean before(Date other) {
         return (_year<other._year) || (_year==other._year && _month<other._month)
        || (_year==other._year && _month==other._month && _day<other._day);
    }
 /**
     * check if this date is after other date.
     * @param other The date to check if this date is after.
     * @return True if this date is after other date.
     */
    
    public boolean after(Date other)
    {
        return other.before(this);
    }

    /**
    * @return String that represents this date
    * in the following format:
    * day.month.year (14/6/2017)
    */
    public String toString() {
        return _day +"/" + _month + "/" + _year;
    }

}

