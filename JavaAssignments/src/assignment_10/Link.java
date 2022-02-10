package assignment_10;

public class Link <T>{
    public T data;
    public Link<T> next;

    public Link(T data,Link<T> next){
        this.data = data;
        this.next = next;
    }
    public  String toString(){
        if(data != null){
            return this.data.toString();
        }
        else {
            return "";
        }
    }
}
