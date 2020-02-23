package test1;

import java.util.ArrayList;
import java.util.Collection;

 class Name{
    public String name1;
    public String name2;

     public Name(String name1, String name2) {
         this.name1 = name1;
         this.name2 = name2;
     }

     public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    @Override
    public String toString() {
        return "test1.Name{" +
                "name1='" + name1 + '\'' +
                ", name2='" + name2 + '\'' +
                '}';
    }
}
public class Test {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("hello");
        collection.add(new Name("f1", "f2"));
        collection.add(new Integer(100));
        System.out.println("集合的大小为：" + collection.size());
        System.out.println(collection);
    }
}
