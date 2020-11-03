package com.com.devil.runoob.iterator;

/**
 * @author Hanyanjiao
 * @date 2020/11/3
 */
public class NameRepository implements Container {
    public String names[] = {"Robert","John","Julie","Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
