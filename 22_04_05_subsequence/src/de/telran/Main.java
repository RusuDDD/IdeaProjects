package de.telran;

class SubsequenceService {

    public boolean isSubsequence2(String text, String pattern) {
        return isSubsequenceRecursive(text , pattern, String pattern , int textlength, int patternlength );
    }
    private boolean isSubsequenceRecursive(String text, String pattern, int texlength, int patternlength) {
        if (patternlength==0)
            return true;
        if (texlength<patternlength)
            return false;
        if (text.charAt(texlength-1)==pattern.charAt(patternlength-1))
            return isSubsequenceRecursive(text, pattern, texlength - 1, patternlength - 1);
        return isSubsequenceRecursive(text, pattern, texlength - 1, patternlength);
    }

    public boolean isSubsequence(String text, String pattern) {
        int i = text.length();
        int j = pattern.length();

        while (j > 0)
            if (i < j)
                return false;

        if (text.charAt(i - 1) == pattern.charAt(j - 1)) {
            i--;
            j--;
        } else {
            i--;
        }
        return true;
    }
}