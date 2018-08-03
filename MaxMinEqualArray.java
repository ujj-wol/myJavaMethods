public class MaxMinEqualArray {
  public static void main(String[] args) {
    System.out.println(maxMinEqual(new int[] {11, 4, 9, 11, 8, 5 , 4, 10}));
    System.out.println(maxMinEqual(new int[] {}));
    System.out.println(maxMinEqual(new int[] {2}));
    System.out.println(maxMinEqual(new int[] {1,1,1,1,1,1,1}));
    System.out.println(maxMinEqual(new int[] {2,4,6,8,11}));
    System.out.println(maxMinEqual(new int[] {-2,-4,-6,-8,-11}));
  }

  static int maxMinEqual(int[] a) {
    if(a.length <= 1) return 0;
    
    int max = a[0], min = a[0];
    int maxCount = 0, minCount = 0;

    for(int element : a) {
      if(element == min)
        minCount++;
      else if(element < min) {
        min = element;
        minCount = 1;
      }
      if(element == max)
        maxCount++;
      else if(element > max) {
        max = element;
        maxCount = 1;
      }
    }
    if(max != min && maxCount == minCount)
      return 1;
    return 0;
  }
}
