class Solution {
    public int strStr(String haystack, String needle) {
        String str1 =haystack;
        String str2 = needle;
         return firstOccuranceMethod(haystack,needle);
    }
    public static int firstOccuranceMethod(String str1, String str2) {
		if(str1.contains(str2)) {
			int res = str1.indexOf(str2);
			return res;}
		else {
		 return -1;}
	}
}