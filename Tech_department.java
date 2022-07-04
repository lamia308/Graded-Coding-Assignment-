public class Tech_department  extends Super_department {
	 public static String departmentName() {
        return "Tech Department";
 }
	 public static String getTodaysWork () {
        return "Complete coding of module 1";
 }
	 public static String getWorkDeadline() {
        return "Complete by EOD";
 }
	 private static String getTechStackInformation() {
        return "Core Java";
 }
 public static void main(String[] args) {	
	 String s = departmentName();
     System.out.println("Welcome to " + s);
     String s1 = getTodaysWork();
     System.out.println(s1);
     String s2 = getWorkDeadline();
     System.out.println(s2);
     String s4 = getTechStackInformation() ;
     System.out.println(s4);
     String s3 = isTodayAHoliday();
     System.out.println(s3);
	}
 
 
}
