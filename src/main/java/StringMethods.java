
public class StringMethods {
    public String removeSpaces(String str) {
        if (str.isEmpty()) {

            return "No value";
        } else {
           str = str.trim();
        }

        return str;
    }
    public String removeAllAs(String str) {
        if (str.isEmpty()) {

            return "No value";
        } else {
            str = str.replace("a","");
        }

        return str;
    }
    public String removeAllZeros(String str) {
        String replace = str.replace("0","");
        if (str.isEmpty()) {

            return "Not valid string";
        } else if (str.equals(replace)){

            return "This is a valid string";
        } else {
            str = replace;
        }

        return str.trim();
    }
    public String removeAllSpaces(String str) {
        if (str.isEmpty()) {
            return "Not valid string";
        } else {
            str = str.replace(" ", "");
        }

        return str;
    }
    public String countAs(String str) {
        if (str.isEmpty()) {
            return "Not valid string";
        } else {
            int countAs = 0;
            String strWithoutA = "";
            char a = 'a';
            char bigA = 'A';

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == a) {
                    countAs++;
                }
            }
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == bigA) {
                    countAs++;
                }
            }
            strWithoutA = str.replace("a", "").replace("A", "");

            return "" + countAs + ", " + strWithoutA.length();
        }
    }
    public boolean countJava(String str) {
        boolean isJavaContain = false;
        String java = "Java";
        String[] strArr = str.split(" ");
        for (String word : strArr){
            for (String s : strArr) {
                if (s.equals(java)) {
                    isJavaContain = true;
                }
            }
        }

        return isJavaContain;
    }
    public String insertQuotes(String str) {
        String insQuo = "\"" + str + "\"";

        if (str.isEmpty()) {
            return "Not valid string";
        } else {
            return insQuo;
        }
    }
    public String insertQuotes(String str, String str2) {
        String insQuo = str.concat(":") + " " + "\"" + str2 + "\"";

        if (str.isEmpty()) {
            return "Not valid string";
        } else {
            return insQuo;
        }
    }
    /*
    Task 9
    Write a method that takes a city name as input and corrects the spelling
     */
    public String improveCityName(String str) {
        String toLowCase = str.toLowerCase();
        String toUpperCase = toLowCase.toUpperCase().substring(0,1);
        return toUpperCase + toLowCase.substring(1,str.length());
    }
}
