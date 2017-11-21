public class StringManipulation {
    public String trimAndConcat(String string1, String string2) {
        return string1.trim() + string2.trim();
    }
    public Integer getIndexOrNull(String string1, char letter){
        int idx = string1.indexOf(letter);
        if (idx != -1){
            return idx;
        }
        return null;
    }
    public Integer getIndexOrNull(String string1, String string2){
        int idx = string1.indexOf(string2);
        if(idx != -1){
            return idx;
        }
        return null;
    }
    public String concatSubstring(String string1, int num1, int num2, String string2){
        String substring = string1.substring(num1, num2);
        return substring + string2;
    }
}