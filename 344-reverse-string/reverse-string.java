class Solution {
    public void reverseString(char[] s) {
int len=s.length-1;

      for(int i=0;i<=len;i++){
        char a=s[i];
        s[i]=s[len];
        s[len]=a;
        len--;
      } 
    }
}
