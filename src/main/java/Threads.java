import java.util.*;

class MyClass implements Comparable{

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
class MyClazz /*implements Comparable*/{
  private String st;
    MyClazz(String s){
        this.st = s;
    }

    @Override
    public String toString() {
        return "MyClazz{" +
                "st='" + st + '\'' +
                '}';
    }

    //@Override
    public int compareTo(Object o) {
        return 0;
    }
}
class MyCom implements Comparator<MyClazz>{

    @Override
    public int compare(MyClazz myClazz, MyClazz t1) {
        return -1;
    }
}


public class Threads {
    public static String str = "123";



    public static void main(String[] args) throws InterruptedException {
        HashSet<String> city = new HashSet<String>();
        city.add("A");
        city.add("C");
        city.add("B");
        city.add("Q");
        city.add("L");
        city.add("Z");
        city.add("M");

        System.out.println(city);
        NavigableSet<MyClazz> ns = new TreeSet<MyClazz>(new MyCom());
        ns.add(new MyClazz("qwe"));
        ns.add(new MyClazz("qwefds"));
        ns.add(new MyClazz("qe"));
        ns.add(new MyClazz("qswe"));
        ns.add(new MyClazz("qweaaa"));
        System.out.println(ns);
    }



    }




