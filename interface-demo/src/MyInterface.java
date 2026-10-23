/*
interface
class
enum
record
 */

//there is no constructor in interface
public abstract interface MyInterface {
    public static final int num =5;
    final int num2 = 5;
    static int num3 = 6;
    public int num4 = 5;
    int num7 = 6;

    //class implements interface
    //class extends class
    //interface extends interface

    //class can be horizonal(more) and vertical
    //interface is always vertical

    //when implementing interface, 1. type become the same

    //before java 8
    public abstract  void test();

    //After
    void test1();
}
