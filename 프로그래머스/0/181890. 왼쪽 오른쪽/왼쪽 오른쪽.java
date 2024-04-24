class Solution {
    public String[] solution(String[] str_list) {
        String str = "";
        for (String s : str_list) { str += s; }
        
        String result = "";
        int li = str.indexOf("l");
        int ri = str.indexOf("r");
        
        if (li != -1 && ri != -1) {
            if (0 < li && li < ri) { 
                result = str.substring(0, li);
            } else if (ri != str.length() - 1 && ri < li) { 
                result = str.substring(ri + 1);
            }
        } else if (li != -1 && ri == -1) {
            if (0 < li) { result = str.substring(0, li); }
        } else if (li == -1 && ri != -1) {
            if (ri != str.length() - 1) { result = str.substring(ri + 1); }
        }
        
        return result.isEmpty() ? new String[]{} : result.split("");
    }
}