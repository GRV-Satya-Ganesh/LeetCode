class Solution {
    public String addStrings(String num1, String num2) {
        int l1 = num1.length();
        int l2 = num2.length();

        StringBuilder sb = new StringBuilder();

        int i = l1-1;
        int j = l2-1;
        int carry = 0;

        while(i >= 0 || j >= 0 || carry != 0){
            int sum = carry;

            if(i >= 0){
                sum += num1.charAt(i) - '0';
                i--;
            }
            if(j >= 0){
                sum += num2.charAt(j) - '0';
                j--;
            }

            sb.append(sum % 10);
            carry = sum/10;
        }

        return sb.reverse().toString();
    }
}