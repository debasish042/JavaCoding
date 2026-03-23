package Collection;

import java.util.Objects;

public class EqualHashCode {

    private int age;
    private String name;
    private String address;

    public EqualHashCode(int age,String name,String address){
        this.age=age;
        this.name=name;
        this.address=address;
    }

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj) return true; // same reference

        if(obj==null|| obj.getClass()!=this.getClass()) return false;

        EqualHashCode e =  (EqualHashCode)obj;

        return age==e.age &&name.equals(e.name)&&address.equals(e.address);
    }

    @Override
    public int hashCode(){
        return Objects.hash(age,name,address);
    }

    @Override
    public String toString(){
        return "EqualHashCode{" +
                "age="+age +"/" +
                "name="+name +"/" +
                "address="+address +'}';

    }

}
