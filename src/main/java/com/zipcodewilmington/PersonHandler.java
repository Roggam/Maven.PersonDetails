package com.zipcodewilmington;

import java.util.Arrays;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    public static void main(String[] args) {


        Person person1 = new Person("Leon", "Hunter");
        Person person2 = new Person("Tariq", "Hook");
        Person person3 = new Person("Dolio", "Durant");
        Person person4 = new Person("JR", "Gamboa");

        Person[] personArray = {person1, person2, person3, person4};

        System.out.println(Arrays.toString(personArray));

    }

    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {

        String result = "";
        Integer count = 0;


        // create a `counter`


        // while `counter` is less than length of array
        // begin loop
        while (count < personArray.length) {
            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            result += personArray[count].toString();  // append `stringRepresentation` to `result` variable
            count++;

        }
        // end loop
        return result;
    }


    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
        // begin loop
        for (int i = 0; i < personArray.length; i++) {
            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            result += personArray[i].toString();

        } // end loop

        return result;
    }


    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name
        for (Person element : personArray) {
            // use the above discoveries to declare for-each-loop signature
            // begin loop

            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            result += element.toString();


        }// end loop
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
