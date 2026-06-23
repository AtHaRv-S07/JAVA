

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Scanner sc=new Scanner(System.in);
        Calendar cl=Calendar.getInstance();
        cl.set(year,month-1,day) ;
        String[] days = {"SUNDAY", "MONDAY", "TUESDAY",
                         "WEDNESDAY", "THURSDAY",
                         "FRIDAY", "SATURDAY"};
        
          int doW=cl.get(Calendar.DAY_OF_WEEK);
          return days[doW - 1];
    }

}

