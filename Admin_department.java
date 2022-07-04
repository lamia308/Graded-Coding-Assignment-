public class Admin_department extends Super_department {
	public static String departmentName() {
        return "  Admin Department";
 }
	public static String getTodaysWork() {
        return "Complete your documents Submission";
 }
	public static String getWorkDeadline() {
        return "Complete by EOD";
 }
	public static void main(String[] args) {
		String s = departmentName();
        System.out.println("Welcome to " + s);
        String s1 = getTodaysWork();
        System.out.println(s1);
        String s2 = getWorkDeadline();
        System.out.println(s2);
        String s3 = isTodayAHoliday();
        System.out.println(s3);
	}

}
