package com.test;

public interface MyInterface {


    void method1(String str);

    default void log(String str){
        System.out.println("I1 logging::"+str);
    }

    default void log2(String str){
        System.out.println("I1 logging::"+str);
    }

    static void print(String str){
        System.out.println("Printing "+str);
    }

    static void print2(String str){
        System.out.println("Printing "+str);
    }

    //trying to override Object method gives compile time error as
    //"A default method cannot override a method from java.lang.Object"

//	default String toString(){
//		return "i1";
//	}

}
