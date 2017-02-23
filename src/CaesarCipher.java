/**
 * Created by jb039k on 11/28/2016.
 */

import java.util.Scanner;

public class CaesarCipher {

    public static void encryptString(String unencryptedStr, int strLen, int rotation){
        char[] unencrypted = unencryptedStr.toCharArray();
        StringBuilder encrypted = new StringBuilder(strLen);

        for(int i=0; i<strLen; i++){
            char uCh = unencrypted[i];

            // check if char is a letter
            if(Character.isAlphabetic(uCh)) {
                if(Character.isUpperCase(uCh)){
                    // get ascii int value mod 26 to get position in alphabet array
                    int ch = ((uCh-'A'+rotation)%26)+'A';
                    char eChar = (char)ch;
                    encrypted.append(eChar);
                }
                else{
                    // get ascii int value mod 26 to get position in alphabet array
                    int ch = ((uCh-'a'+rotation)%26)+'a';
                    char eChar = (char)ch;
                    encrypted.append(eChar);
                }

            }
            else{
                encrypted.append(uCh);
            }

        }

        System.out.println(encrypted.toString());
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int strLen = sc.nextInt();
        String unencrypted = sc.next();
        int rotation = sc.nextInt();
        encryptString(unencrypted, strLen, rotation);
    }
}
