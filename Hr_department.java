public class Hr_department  extends Super_department  {
	public static String departmentName() {
        return "Hr Department";
 }
	public static String getTodaysWork () {
        return "Fill today’s worksheet and mark your attendance";
 }
	public static String getWorkDeadline() {
        return "Complete by EOD";
 }
	private static String doActivity() {
        return "team Lunch";
 }
	public static void main(String[] args) {
		String s = departmentName();
        System.out.println("Welcome to " + s);
        String s4 = doActivity() ;
        System.out.println(s4);      
        String s1 = getTodaysWork();
        System.out.println(s1);
        String s2 = getWorkDeadline();
        System.out.println(s2);
        String s3 = isTodayAHoliday();
        System.out.println(s3);

	}

}
