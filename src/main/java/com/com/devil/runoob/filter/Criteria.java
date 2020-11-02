package com.com.devil.runoob.filter;


import java.util.List;

/**
 * @author Hanyanjiao
 * @date 2020/11/2
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
