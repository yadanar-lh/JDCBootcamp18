package com.jdc;
//break - inside looping, not in if(error)
//continue - after continue, no codes work, stop current loop
//return - end of the method and reach to where it is called

import java.io.FileReader;
import java.io.IOException;

//finally works even after above three
// finally does not work in only one condition, system.exitcode0 before finally.

//to close files
class MyClass implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Closing MyCLassResource");
        throw new RuntimeException("MyClass Exception");
    }
}
public class FinallyDemo {
//    public void test(){
//        FileReader fileReader = null;
//        try {
//            fileReader = new FileReader("text.txt"); //if error is here, close is not reached.
//           fileReader.close();
//        } catch (Exception e){
//
//        } finally {
//            try {
//                fileReader.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }

    public void test(){
        MyClass obj = new MyClass();
        //with try with resources, finally is not needed.
        //try(FileReader fr = new FileReader("src/com/jdc/backendLayer.txt"))
        try(obj)  {
//            throw new RuntimeException();
//            return;
            System.out.println("JVM Exist.");
//            System.exit(0);
            throw new RuntimeException("Main Exception");
        } catch (Exception e){
            e.printStackTrace();
            for(Throwable suppress: e.getSuppressed()){
                System.out.println(suppress);
            }
        }
//        finally {
//            System.out.println("Finally Block");
//        }
    }

    void main(){
        test();
    }

}
