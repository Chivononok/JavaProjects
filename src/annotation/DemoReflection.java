package annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DemoReflection {
    public static void main(String args[]) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {
        Man man = new Man();

        //==== вызов метода getInfo у класса Man при помощи рефлексии ====
        System.out.println("==== вызов метода getInfo у класса Man при помощи рефлексии ====");
        Method[] mthds = Man.class.getDeclaredMethods();
        for (Method mthd:mthds){
            if (mthd.getName()=="getInfo"){
                mthd.invoke(man, man);
            }
        }
        System.out.println("================================================================");
        //================================================================

        //========== вызов метода printHelloWorld у класса Hello =========
        System.out.println("вызов метода printHelloWorld у класса Hello");
        Hello hello = new Hello();
        Class helloClass = Class.forName(Hello.class.getName());
        Method mHello = helloClass.getDeclaredMethod("printHelloWorld");
        mHello.invoke(hello);
        System.out.println("================================================================");
        //================================================================

        //=== отображение инф-ции о наличии аннотации AcademyInfo у метода ===
        System.out.println("отображение инф-ции о наличии аннотации AcademyInfo у метода");
        Method[] mthds2 = Man.class.getDeclaredMethods();
        for (Method mthd2:mthds2){
            if (mthd2.isAnnotationPresent(AcademyInfo.class)) {
                AcademyInfo annotation = mthd2.getAnnotation(AcademyInfo.class);  //получили аннотации у метода
                System.out.println("У метода " + mthd2.getName() + " есть аннотация AcademyInfo, параметр Year=" + annotation.year());
            }else{
                System.out.println("У методА " + mthd2.getName() + " нет аннотации AcademyInfo");
            }
        }
        System.out.println("================================================================");
        //====================================================================
    }
}
