package com.com.devil.runoob.compositeEntity;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1,String data2){
        cgo.setData(data1,data2);
    }

    public String[] getData(){
        return cgo.getData();
    }
}
