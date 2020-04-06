public class GenericMethodTest
{
    // 泛型方法 printArray
    public static < E > void printmyArray(E[] inputArray )
    {
        // 输出数组元素
        for ( E element : inputArray ){
            System.out.printf(String.valueOf(element) + "  ");
//            "%s ",
        }
        System.out.println();
    }

    public static void main( String args[] )
    {

        // 创建不同类型数组： Integer, Double 和 Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println( "整型数组元素为:" );
        printmyArray( intArray  ); // 传递一个整型数组

        System.out.println( "\n双精度型数组元素为:" );
        printmyArray( doubleArray ); // 传递一个双精度型数组

        System.out.println( "\n字符型数组元素为:" );
        printmyArray( charArray ); // 传递一个字符型数组

    }
}





class MethodCall {
       public static void main(String[] args) {
    System.out.println(Test.var);
    Test.sayStatic();
//        Test test = new Test();
//        test.sayInstance();
        }
}
class Test{
        public static int var = 1; // 调用静态方法及对象 可以无需创建对象。
    //静态方法在访问本类的成员时，只允许访问静态成员（即静态成员变量和静态方法），而不允许访问实例成员变量和实例方法；实例方法则无此限制。
    //静态方法中也不能使用关键字this。
      public static void sayStatic() {
        System.out.println("这是一个静态方法。");
          int[] int_var = {1,2,3};
          System.out.println("hahah" + java.util.Arrays.toString(int_var));
      }

        public void sayInstance() {
        System.out.println("这是一个实例方法。");
        }
        //实例方法 只能使用"对象名.方法名"的方式
        }

 /**
  * super关键字表示父类（超类）。子类引用父类的字段时，可以用super.fieldName.
  *  super(name, age); // 调用父类的构造方法Person(String, int)
  *
  * Override和Overload不同的是，如果方法签名如果不同，就是Overload，Overload方法是一个新方法；
  * 如果方法签名相同，并且返回值也相同，就是Override
  *  在继承关系中，子类如果定义了一个与父类方法签名完全相同的方法，被称为覆写（Override)
  *
  *  abstract class implement了interface之后，尚未定义的函数不需要写override声明
  *  interface extends interface之后，尚未定义的函数不需要写override声明
  */



 /**      Abstract Class:
  * 如果父类的方法本身不需要实现任何功能，仅仅是为了定义方法签名，目的是让子类去覆写它，那么，可以把父类的方法声明为抽象方法：
  * abstract class Person {
  *     public abstract void run();
  * }
  * 我们无法实例化一个抽象类
  * 抽象类的成员变量、成员方法和构造方法的访问方式和普通类一样。
  * 一个类只能继承一个抽象类
  * e.g.
  * abstract class Person {
  *     public abstract void run();
  * }
  * 在实现子类的时候，就必须 OverRide run()方法：
  *
  *
  * 若abstract class implement 了接口，接口中的函数即使在abstract clsss中未定义， 也是可以被abstract class直接调用的
  */


/**
 * interface不能有字段。
 * 因为接口定义的所有方法默认都是public abstract的，所以这两个修饰符不需要写出来（写不写效果都一样）。
 * 在实现子类的时候，就必须 OverRide run()方法
 *
 *
 * 一个interface可以继承自另一个interface。interface继承自interface使用extends:
 * interface Hello {
 *     void hello();
 * }
 *
 * interface Person extends Hello {
 *     void run();
 *     String getName();
 * }
 *
 * default方法的目的是，当我们需要给接口新增一个方法时，会涉及到修改全部子类。
 * 如果新增的是default方法，那么子类就不必全部修改，只需要在需要覆写的地方去覆写新增方法
 *
 *
 * 但是，interface是可以有静态字段的，并且静态字段必须为final类型：
 * public interface Person {
 *     public static final int MALE = 1;
 *     public static final int FEMALE = 2;
 * }
 * interface的字段只能是public static final类型，
 */



/** 基本数据类型介绍：
 *  Strings can be concatenated using +
 *  String.toUpperCase()
 *  String.valueOf()
 *
 *
 *  boolean[] bool_var = new boolean[8];
 *  int[] int_var = {1,2,3};
 *
 *
 */

/**
 * java 增强版 for 语句
 * int [] numbers = {10, 20, 30, 40, 50};
 *
 *       for(int x : numbers ){
 *          System.out.print( x );
 *          System.out.print(",");
 *       }
 */


/**
 * public interface Comparable<T>此接口强行对实现它的每个类的对象进行整体排序。
 * 如果一个数组中的对象实现了 Compareable 接口，则对这个数组进行排序非常简单：
 * Arrays.sort(); 如果 List 实现了该接口的话 , 我们就可以调用Collections.sort 或者 Arrays 方法给他们排序。
 * 实际上 Java 平台库中的所有值类 (value classes) 都实现了 Compareable 接口。
 * Comparable 接口只有一个方法 compareTo(Object obj)
 * 其中
 * this < obj 返回负
 * this = obj 返回 0
 * this > obj 返回正
 * */


class over_ride implements Comparable<over_ride> {
    int var;
    String var2;
    boolean var3;

    /**
     * hashCode(),equals,compareTo() should be consistent
     */
    @Override
    public boolean equals(Object o) {
        // 1 相当于hashcode相等，具有相同的散列数
        if (this == o) {
            return true;
        }
        // 2 如果另一个对象不是当着的class类型，那必然是不相等的
        if (!(o instanceof over_ride)) {
            return false;
        }
        // 3 判断对象的私有成员是否相等。
        over_ride that = (over_ride) o;
        return (this.var)==(that.var) && (this.var2).equals(that.var2)&&(this.var3) == (that.var3);
        /**
         Object类中的equals()方法：

         public boolean equals(Object obj)
         {
         //调用equal的对象的地址和参数对象的地址是否相等
         return (this == obj);
         }

         String类中的equals()方法：
         判断当前字符串与传递进来的字符串的内容是否一致。
         *
         */

    }


    @Override
    public int hashCode() {

        // 初始值为一个非零数
        int result = 17;

        // 为每个成员变量计算值
        result = 31 * result + (var3 ? 1 : 0);
        result = 31 * result + var2.hashCode();
        result = 31 * result + var;
        System.out.println(12);
        return result;
    }

/**
 * Interger.toString(): 返回表示 Integer 值的 String 对象。
 *      Integer a = 5;
 *         System.out.println(a.toString());
 * @param
 */
    public String toString(int i){
        // 按自己想要的效果来修改
        return (String.valueOf(var) +  (var3?"true" : "false") + var2);
    }

    @Override
    public int compareTo(over_ride that) {
        return (this.var - that.var);
    }
    /**
     * int compareTo(String str) 按字典顺序比较两个字符串。
     * compareToIgnoreCase(String str) 按字典顺序比较两个字符串，不考虑大小写。
     * str1.compareTo(str2)
     * compareTo是按照按字典顺序去比较两个字符串的，
     *  顺序相等，则返回0，变量1的顺序在变量2之前则返回负值数，变量1的顺序在变量2之后则返回正值数
     * 比较的时候，相等则继续比较下一位数，直到有一位数不等，进行比较，但要注意，只会比较一次，以这一次的值作为比较数据
     * ；如果两个变量位数相等、顺序一致，则返回零；
     *  如果顺序相等，位数不等，则位数之间相减（str1.size() - str2.size()）
     *
     * compareTo(Expression other) must be consistent with equals(Object o).
     *  e.equals(o)
     * implies that the actual type of o is a subtype of Expression and
     * e.compareTo((Expression) o) == 0.
     */
}


/**
 * Hash map 用法：Java map 详解 - 用法、遍历、排序、常用API等
 * https://www.cnblogs.com/lzq198754/p/5780165.html
 */