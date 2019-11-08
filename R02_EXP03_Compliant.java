/******************************************************************************
 *  Rule02 - EXP03
 *  Compliant
 ******************************************************************************/

public class Wrapper {
  public static void main(String[] args) {
    Integer i1 = 100;
    Integer i2 = 100;
    Integer i3 = 1000;
    Integer i4 = 1000;
    System.out.println(i1.equals(i2));
    System.out.println(!i1.equals(i2));
    System.out.println(i3.equals(i4));
    System.out.println(!i3.equals(i4));
  }
}



