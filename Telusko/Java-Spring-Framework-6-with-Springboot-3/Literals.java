public class Literals
{
	public static void main(String[] args) {
        // literals:
        int num1 = 0b101;
        int num2 = 0x7E;
        int num3 = 10_00_000;
        double num5 = 12E10;
        double num4 = 203;
        char ch = 'A';
        ch++;
        boolean flag = true;
        System.out.println(num1+" "+num2+" "+num3+" "+ num4+" "+num5+" "+ch);
	}
}
Output:
5 126 1000000 203.0 1.2E11 B
