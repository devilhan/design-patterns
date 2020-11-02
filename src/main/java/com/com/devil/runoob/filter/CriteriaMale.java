package com.com.devil.runoob.filter;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Hanyanjiao
 * @date 2020/11/2
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        for (Person person :persons){
            if (person.getGender().equalsIgnoreCase("male"))
            malePersons.add(person);
        }
        return malePersons;
    }
}
