package class2;

import java.io.*;
import java.math.BigInteger;

public class prob15829 {
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        BigInteger result = new BigInteger("0");
        for(int i=0;i<n;i++){
            result = result.add(BigInteger.valueOf(s.charAt(i)-96).multiply(BigInteger.valueOf(31).pow(i)));
        }
        System.out.println(result.remainder(BigInteger.valueOf(1234567891)));
    }
}
