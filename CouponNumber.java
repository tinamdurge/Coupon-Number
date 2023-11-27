public class CouponNumber{
public static void main(String []args){
char[] chars="abcdefghigklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
int max=100000000;
int random=(int)(Math.random()*max);
StringBuffer str=new StringBuffer();
while(random>0)
{
str.append(chars[random%chars.length]);
random/=chars.length;
}
String couponCode=str.toString();
System.out.println("Coupon Code:"+couponCode);
}
}