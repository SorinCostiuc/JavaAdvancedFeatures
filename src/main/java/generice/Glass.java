package generice;

import java.util.List;
////se restrange la un singur tip de elemente////

//public class Glass<T extends Liquid> {


public class Glass<T> {
    private T object;
    private List<T> objectList;

    public Glass(){

    }

    public Glass(List<T> objectList) {
        this.objectList = objectList;
    }

    public T getObject() {
        return object;
    }
    public void setObject(T object) {
        this.object = object;
    }

    public void doSomething(){
        System.out.println(objectList);
    }

    public void doSomethingObject(){
        System.out.println(object);
    }

    public void add (T newObject){
        objectList.add(newObject);
    }



}
