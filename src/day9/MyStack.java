package day9;

public class MyStack {
    public static void main(String[] args){
        int size=10;
        GStack<String> stringStack=new GStack<String>(size);

        stringStack.push("seoul");
        stringStack.push("Pusan");
        stringStack.push("LA");

        for(int i=0;i<size;i++){
            String str=stringStack.pop();
            if(str!=null) System.out.println(str);
        }
        GStack<Integer> intStack=new GStack<Integer>(size);
        intStack.push(1);
        intStack.push(3);
        intStack.push(5);

        for(int i=0;i<size;i++){
            Integer is=intStack.pop();
            if(is != null)System.out.println(is);
        }

    }
}
class GStack<T>{
    Object[] stack;
    int size;
    public GStack(int size) {
        this.size=0;
        stack=new Object[size];
    }
    public void push(T item){
        if(size==stack.length)
            return;
        stack[size]=item;
        size++;
    }
    @SuppressWarnings("unchecked")
    public T pop(){
        if(size==0)
            return null;
        size--;
        return (T)stack[size];
    }
}

