class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1; // Pointer for string `a`
        int j = b.length() - 1; // Pointer for string `b`
        int carry = 0; // Initialize carry to 0

        // Traverse both strings from the end
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            // Add the current bit of `a` if it exists
            if (i >= 0) {
                sum += a.charAt(i) - '0'; // Convert char to int
                i--;
            }

            // Add the current bit of `b` if it exists
            if (j >= 0) {
                sum += b.charAt(j) - '0'; // Convert char to int
                j--;
            }

            // Append the sum % 2 to the result
            result.append(sum % 2);

            // Update the carry
            carry = sum / 2;
        }

        // Reverse the result to get the correct order
        return result.reverse().toString();

    }
}