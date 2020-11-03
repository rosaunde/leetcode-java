package medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class RestoreIPAdresses {

    int len;

    public List<String> restoreIpAddresses(String s) {

        len = s.length();
        List<String> result = new ArrayList<>();
        // to remove not possible strings before hand
        if (len < 4 || len > 12) return result;
        LinkedList<String> segments = new LinkedList<String>();
        ipAddressHelper(s, 0, 3, segments, result);
        return result;
    }

    private void ipAddressHelper(String s, int i, int dotCount, LinkedList<String> segments, List<String> result) {
        //base case
        if(dotCount == 0){
            String lastSegment = s.substring(i);
            if(isValid(lastSegment)){
                segments.add(lastSegment);
                result.add(String.join(".", segments));
                segments.removeLast();
            }
            return;
        }

        for(int j=i; j < s.length() - 1 && j < i+3; j++) {
            String segment = s.substring(i,j+1);
            if(isValid(segment)){
                segments.add(segment);
                ipAddressHelper(s, j+1, dotCount-1, segments, result);
                segments.removeLast();
            }
        }
    }

    private boolean isValid(String segment)
    {
        int m = segment.length();
        if(m > 3) return false;
        return segment.charAt(0) != '0' ? Integer.valueOf(segment) <=255 : m == 1;
    }
}