package com.kejia.sample.actionModel;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:迭代器模式的实现
 * @DATE:CRETED: IN 16:49 2019/9/4
 * @MODIFY:
 */
interface Iterator<T>{
    public boolean hasNext();
    public T next();
}
interface aggregate{
    public Iterator createIterator();
}

public class StringArray implements aggregate{

    private String strs[];
    public StringArray(String[] strs){
        this.strs = strs;
    }



    @Override
    public Iterator createIterator() {
        return (Iterator)new StringIterator();
    }

    private class StringIterator implements Iterator{
        private int position;

        @Override
        public boolean hasNext() {
            return (position<strs.length);
        }

        @Override
        public String next() {
            if(this.hasNext()){
                return strs[position++];
            }
            else
                return null;
        }
    }

    public static void main(String[] args) {
        String[] ss = {"sdfsf","sdfsae","eeeee"};
        StringArray example = new StringArray(ss);
        Iterator it = example.createIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
