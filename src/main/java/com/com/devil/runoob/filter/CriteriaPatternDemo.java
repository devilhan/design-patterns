package com.com.devil.runoob.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hanyanjiao
 * @date 2020/11/2
 */
public class CriteriaPatternDemo {
    public static void main(String[] args){
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Robert","Male","Single"));
        persons.add(new Person("John","Male","Married"));
        persons.add(new Person("Laura","Female","Married"));
        persons.add(new Person("Mike","Male","Single"));
        persons.add(new Person("Bobby","Male","Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single,male);
        Criteria singleOrFemale = new OrCriteria(single,female);

        System.out.println("Males:");
        printPersons(male.meetCriteria(persons));

        System.out.println("-------------------------");

        System.out.println("Female:");
        printPersons(female.meetCriteria(persons));

        System.out.println("--------------------------");

        System.out.println("single");
        printPersons(single.meetCriteria(persons));

        System.out.println("---------------------------");

        System.out.println("single and male");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("----------------------------");

        System.out.println("single or female");
        printPersons(singleOrFemale.meetCriteria(persons));

    }

    private static void printPersons(List<Person> persons) {
        for (Person person :persons){
            System.out.println("Person: [name: "+person.getName()
                    + ",Gender : "+person.getGender()
                    + ",Marital Status: "+ person.getMaritalStatus()+"]");
        }
    }
}
