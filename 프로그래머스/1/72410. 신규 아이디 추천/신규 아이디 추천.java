class Solution {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase();
        
        // StringBuilder sb = new StringBuilder();
        // for (char c : new_id.toCharArray()) {
        //     if ('a' <= c && c <= 'z' || '0' <= c && c <= '9' || c == '-' || c == '_' || c == '.') { sb.append(c); }
        // }
        // new_id = sb.toString();
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
        new_id = new_id.replaceAll("[.]{2,}", "."); 
        
        // if (new_id.indexOf(".") == 0) { new_id = new_id.substring(1); }
        // if (!new_id.isEmpty() && new_id.lastIndexOf(".") == new_id.length() - 1) {
        //     new_id = new_id.substring(0, new_id.length() - 1);
        // }
        new_id = new_id.replaceAll("^[.]|[.]$", "");
        
        if (new_id.isEmpty()) { new_id = "a"; }
        if (new_id.length() > 15) { new_id = new_id.substring(0, 15); }
        // if (!new_id.isEmpty() && new_id.lastIndexOf(".") == new_id.length() - 1) {
        //     new_id = new_id.substring(0, new_id.length() - 1);
        // }
        new_id = new_id.replaceAll("[.]$", "");
        if (new_id.length() <= 2) {
            new_id += String.valueOf(new_id.charAt(new_id.length() - 1)).repeat(3 - new_id.length());
        }
        
        return new_id;
    }
}