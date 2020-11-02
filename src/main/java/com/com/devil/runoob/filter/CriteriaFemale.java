package com.com.devil.runoob.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hanyanjiao
 * @date 2020/11/2
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<>();
        for (Person person:persons){
            if (person.getGender().equalsIgnoreCase("female")){
                femalePersons.add(person);
            }
        }

        return femalePersons;
    }
}
