package com.com.devil.runoob.filter;

import java.util.List;

/**
 * @author Hanyanjiao
 * @date 2020/11/2
 */
public class AndCriteria implements Criteria {

    private Criteria criteria;

    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);

        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }

}
