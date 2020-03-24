package tClass;
import HW2.CompareObjects;

public class tCompareObjects {

    private static Object obj1 = new Object();
    private static Object obj2 = new Object();

    private static Object object1 = obj1.getClass();
    private static Object object2 = obj2.getClass();

    private static String varObj1="new1";
    //private static String varObj2="new1";

    //private static Integer varObj1=1;
    private static Integer varObj2=2;


    public static void testCompareObjects(){
        System.out.println(CompareObjects.compare(object1,object2));
        System.out.println(CompareObjects.compareToString(object1,object2));
        System.out.println(CompareObjects.compareHashCode(object1,object2));
        System.out.println(" ");


        System.out.println(CompareObjects.compareOne(obj1,obj1));
        System.out.println(" ");


        if ((CompareObjects.checkObjects(varObj1,varObj2)) == (1)){
            System.out.println(CompareObjects.compare(varObj1,varObj2));
            System.out.println(CompareObjects.compareToString(varObj1,varObj2));
            System.out.println(CompareObjects.compareHashCode(varObj1,varObj2));
        } else if ((CompareObjects.checkObjects(varObj1,varObj2)) == 2){
            System.out.println(CompareObjects.compare(varObj1,varObj2));
            System.out.println(CompareObjects.compareToString(varObj1,varObj2));
            System.out.println(CompareObjects.compareHashCode(varObj1,varObj2));
        } else
            System.out.println("Объекты разного типа");
        System.out.println(" ");
    }
}
