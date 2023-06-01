import java.lang.String;

public class MyStringTest {
    public static void main(String argv[]) {
        String stringOrig = "1234567812345678123456781234567812345678123456781234567812345679";
        // String stringOrig =
        // "dnkjdfkvbn12345678123456781234slkdflkhdshgjdfksvdbcmxvb232ekhr234567812345679dnkjkdsnvknsvkjfdnvknfdvkjadnvkknfvkjsdvdnkjjmvsdavbjscnvmasbmvsdbvmzcxvmasng";
        char[] chars = stringOrig.toCharArray();
        String stringToBeFound = "123456789";
        // String stringToBeFound = "dnkj";
        char[] dest = stringToBeFound.toCharArray();

        String stringToBeReplaced = "1234567";
        char[] toBeReplaced = stringToBeReplaced.toCharArray();

        long startTime;
        long endTime;
        MyString a = new MyString(chars);

        int TIMES1 = 1;
        int TIMES2 = 1;

        /*
         * result test
         */
        System.out.println("Index_MyString: " + a.indexOf(dest));
        System.out.println("Index_String:   " + stringOrig.indexOf(stringToBeFound));

        String a_concat = new String(a.concat(dest).getValue());
        System.out.println("Concat_MyString: " + a_concat);
        System.out.println("Concat_String:   " + stringOrig.concat(stringToBeFound));

        String a_replace = new String(a.replace(toBeReplaced, dest).getValue());
        System.out.println("Original: " + stringOrig);
        System.out.println("Replace_MyString: " + a_replace);
        System.out.println("Replace_String:   " +
        stringOrig.replace(stringToBeReplaced, stringToBeFound));

        System.out.println("Length_MyString: " + a.length());
        System.out.println("Length_String:   " + stringOrig.length());

        String a_arr = new String(a.getValue());
        System.out.println("CharArr: " + a_arr);
        System.out.println("CharArr_MyString: " + a.getValue()[0]);
        System.out.println("CharArr_String:   " + stringOrig.toCharArray()[0]);

        /*
         * index time test
         */
        startTime = System.currentTimeMillis(); // get the present time
        for (int i = 0; i < TIMES1; i++) {
            a.indexOf(dest);
            // System.out.println("ret = " + a.indexOf(dest));
        }
        endTime = System.currentTimeMillis();
        System.out.println("IndexTime_MyString: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis(); // get the present time
        for (int i = 0; i < TIMES1; i++) {
            stringOrig.indexOf(stringToBeFound);
            // System.out.println("ret = " + stringOrig.indexOf(stringToBeFound));
        }
        endTime = System.currentTimeMillis();
        System.out.println("IndexTime_String: " + (endTime - startTime) + "ms");

        /*
         * concatenate time test
         */
        startTime = System.currentTimeMillis(); // get the present time
        for (int i = 0; i < TIMES1; i++) {
            a.concat(dest);
            // System.out.println("ret = " + a.indexOf(dest));
        }
        endTime = System.currentTimeMillis();
        System.out.println("ConcatTime_MyString: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis(); // get the present time
        for (int i = 0; i < TIMES1; i++) {
            stringOrig.concat(stringToBeFound);
            // System.out.println("ret = " + stringOrig.indexOf(stringToBeFound));
        }
        endTime = System.currentTimeMillis();
        System.out.println("ConcatTime_String: " + (endTime - startTime) + "ms");

        /*
         * replace time test
         */
        startTime = System.currentTimeMillis(); // get the present time
        for (int i = 0; i < TIMES2; i++) {
            a.replace(toBeReplaced, dest);
            // System.out.println("ret = " + a.indexOf(dest));
        }
        endTime = System.currentTimeMillis();
        System.out.println("ReplaceTime_MyString: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis(); // get present time
        for (int i = 0; i < TIMES2; i++) {
            stringOrig.replace(stringToBeReplaced, stringToBeFound);
        }
        endTime = System.currentTimeMillis();
        System.out.println("ReplaceTime_String: " + (endTime - startTime) + "ms");

        /*
         * length time test
         */
        startTime = System.currentTimeMillis(); // get present time
        for (int i = 0; i < TIMES1; i++) {
            a.length();
            // System.out.println("ret = " + a.indexOf(dest));
        }
        endTime = System.currentTimeMillis();
        System.out.println("LengthTime_MyString: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis(); // get the present time
        for (int i = 0; i < TIMES1; i++) {
            stringOrig.length();
            // System.out.println("ret = " + stringOrig.indexOf(stringToBeFound));
        }
        endTime = System.currentTimeMillis();
        System.out.println("LengthTime_String: " + (endTime - startTime) + "ms");

        /*
         * conversion time test
         */
        startTime = System.currentTimeMillis(); // get the present time
        for (int i = 0; i < TIMES1; i++) {
            a.getValue();
            // System.out.println("ret = " + a.indexOf(dest));
        }
        endTime = System.currentTimeMillis();
        System.out.println("toCharArrayTime_MyString: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis(); // get the present time
        for (int i = 0; i < TIMES1; i++) {
            stringOrig.toCharArray();
            // System.out.println("ret = " + stringOrig.indexOf(stringToBeFound));
        }
        endTime = System.currentTimeMillis();
        System.out.println("toCharArrayTime_String: " + (endTime - startTime) + "ms");
    }
}
/*
 * result:
 * we define TIMES1 = 1000000000, TIMES2 = 1000000000
 * 
 * String stringOrig =
 * "1234567812345678123456781234567812345678123456781234567812345679";
 * 
 * String stringToBeFound = "123456789";
 * 
 * String stringToBeReplaced = "1234567";
 * 
 * IndexTime_MyString: 123517ms
 * IndexTime_String: 563ms
 * ConcatTime_MyString: 70182ms
 * ConcatTime_String: 32397ms
 * ReplaceTime_MyString: 313644ms
 * ReplaceTime_String: 450211ms
 * LengthTime_MyString: 42ms
 * LengthTime_String: 24ms
 * IndexTime_MyString: 40627ms
 * IndexTime_String: 25849ms
 * 
 * we define TIME1 = 600000000, TIME2 = 600000000.
 * 
 * stringOrig = "dnkjdfkvbn12345678123456781234slkd
 * flkhdshgjdfksvdbcmxvb232ekhr234567812345679dnkjkd
 * snvknsvkjfdnvknfdvkjadnvkknfvkjsdvdnkjjmvsdavbjscnvmasbmvsdbvmzcxvmasng";
 * 
 * stringToBeFound = "dnkj";
 * 
 * stringToBeReplaced = "1234567";
 * 
 * IndexTime_MyString: 4849ms
 * IndexTime_String: 442ms
 * ConcatTime_MyString: 44754ms
 * ConcatTime_String: 21696ms
 * ReplaceTime_MyString: 655481ms
 * ReplaceTime_String: 186119ms
 * LengthTime_MyString: 22ms
 * LengthTime_String: 25ms
 * toCharArrayTime_MyString: 34788ms
 * toCharArrayTime_String: 34847ms
 */