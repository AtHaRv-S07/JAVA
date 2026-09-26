class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;
        
        // HashSet stores characters in the current window
        Set<Character> charSet = new HashSet<>();

        // Expand the window with 'right' pointer
        for (int right = 0; right < s.length(); right++) {
            
            // If duplicate found, shrink window from 'left' until duplicate is removed
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }

            // Add current character to set
            charSet.add(s.charAt(right));

            // Window size is (right - left + 1)
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}