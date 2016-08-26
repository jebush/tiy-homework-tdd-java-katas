import java.util.ArrayList;

/**
 * Created by rush on 8/24/16.
 */
public class warmup2 {
    public static String stringTimes(String str, int n) {
        String result = "";
        for (int i=0; i<n; i++) {
            result = result + str;  // could use += here
        }
        return result;
    }

    public static String frontTimes(String str, int n) {
        int frontLen = 3;
        if (frontLen > str.length()) {
            frontLen = str.length();
        }
        String front = str.substring(0, frontLen);

        String result = "";
        for (int i=0; i<n; i++) {
            result = result + front;
        }
        return result;
    }

    public static int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i, i+2).equals("xx")) count++;
        }
        return count;
    }

    public static boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1) return false; // no "x" at all

        // Is char at i+1 also an "x"?
        if (i+1 >= str.length()) return false; // check i+1 in bounds?
        return str.substring(i+1, i+2).equals("x");
    }

    public static String stringBits(String str) {
        String result = "";
        for (int i=0; i<str.length(); i+=2) {
            result = result + str.charAt(i);
        }
        return result;
    }

    public static String stringSplosion(String str) {
        String result = "";
        // On each iteration, add the substring of the chars 0..i
        for (int i=0; i<str.length(); i++) {
            result = result + str.substring(0, i+1);
        }
        return result;
    }

    public static int last2(String str) {
        if (str.length() < 2) return 0;

        String end = str.substring(str.length()-2);

        int count = 0;

        for (int i=0; i<str.length()-2; i++) {
            String sub = str.substring(i, i+2);
            if (sub.equals(end)) {
                count++;
            }
        }

        return count;
    }
    public static int arrayCount9(int[] nums) {
        int count = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }
        return count;
    }
    public static boolean arrayFront9(int[] nums) {
        int end = nums.length;
        if (end > 4) end = 4;

        for (int i=0; i<end; i++) {
            if (nums[i] == 9) return true;
        }

        return false;
    }

    public static boolean array123(int[] nums) {
        for (int i=0; i < (nums.length-2); i++) {
            if (nums[i]==1 && nums[i+1]==2 && nums[i+2]==3) return true;
        }
        return false;
    }

    public static int stringMatch(String a, String b) {
        int len = Math.min(a.length(), b.length());
        int count = 0;

        for (int i=0; i<len-1; i++) {
            String aSub = a.substring(i, i+2);
            String bSub = b.substring(i, i+2);
            if (aSub.equals(bSub)) {
                count++;
            }
        }

        return count;
    }
    public static String stringTheX(String str) {
        String result = "";
        for (int i=0; i<str.length(); i++) {
            if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
                result = result + str.substring(i, i+1);
            }
        }
        return result;
    }

    public static String altPairs(String str) {
        String result = "";

        for (int i=0; i<str.length(); i += 4) {
            int end = i + 2;
            if (end > str.length()) {
                end = str.length();
            }
            result = result + str.substring(i, end);
        }

        return result;
    }

    public static String stringYak(String str) {
        String result = "";

        for (int i=0; i<str.length(); i++) {
            // Look for i starting a "yak" -- advance i in that case
            if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
                i =  i + 2;
            } else { // Otherwise do the normal append
                result = result + str.charAt(i);
            }
        }

        return result;
    }

    public static int array667(int[] nums) {
        int count = 0;
        for (int i=0; i < (nums.length-1); i++) {
            if (nums[i] == 6) {
                if (nums[i+1] == 6 || nums[i+1] == 7) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean noTriples(int[] nums) {
        for (int i=0; i < (nums.length-2); i++) {
            int first = nums[i];
            if (nums[i+1]==first && nums[i+2]==first) return false;
        }

        return true;
    }

    public static boolean has271(int[] nums) {
        for (int i=0; i < (nums.length-2); i++) {
            int val = nums[i];
            if (nums[i+1] == (val + 5) &&
                    Math.abs(nums[i+2] - (val-1)) <= 2)  return true;
        }

        return false;
    }
}
