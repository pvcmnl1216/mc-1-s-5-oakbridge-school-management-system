package com.jap.marksevaluation;

import java.util.Arrays;

public class OakBridgeSchool {

    public static void main(String[] args) {
        OakBridgeSchool oakBridgeSchool = new OakBridgeSchool();
        // Declare and Initialize values to the arrays
        String[] studentNames = {"Michelle", "Kate", "Ann", "Tina", "Tom", "Sam", "Ria", "Pam", "Kate", "Leo"};
        String[] studentSurnames = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Martin", "Clark", "King"};
        // Call the method to convert all the student names to upper case and display results
        for (String studentName : studentNames) {
            System.out.print(oakBridgeSchool.convertToUpperCase(studentName) + " ");
        }
        // Call the method to sort names in alphabetical order and display results
        Arrays.sort(studentNames);
        System.out.println("\n" + Arrays.toString(studentNames));
        // Call the method to find the shortest surname and display results
        String shortSurname = oakBridgeSchool.shortestSurname(studentSurnames);
        System.out.println(shortSurname);
        // Call the method to check if two names in the array are the same and display results
        System.out.println(oakBridgeSchool.shortestSurname(studentSurnames));
        // Call the method to concatenate name and surname with a space in between and display results
        String[] namesArray = oakBridgeSchool.concatenateNameAndSurname(studentNames, studentSurnames);
        oakBridgeSchool.displayStudentNames(namesArray);
    }

    // Convert the given string name to upper case

    /**
     * It takes a string and returns the same string in uppercase
     *
     * @param name The name of the method that will be called in the template.
     * @return A string that is the uppercase version of the input string.
     */
    public String convertToUpperCase(String name) {
        if (name.equals("")) {
            return " ";
        }
        return name.toUpperCase();
    }

    // Find the shortest word in the list of surnames

    /**
     * The function takes an array of strings and returns the shortest string in the array
     *
     * @param surnames an array of strings
     * @return The shortest surname in the array.
     */
    public String shortestSurname(String[] surnames) {
        int smallWord = 0;
        for (int index = 0; index < surnames.length - 1; index++) {
            for (int count = 0; count < surnames.length - 1; count++) {
                if (surnames[count].length() < surnames[count + 1].length()) {
                    smallWord = count;
                } else if (surnames[count + 1].length() == surnames[smallWord].length()) {
                    smallWord = count;
                } else if (surnames[count + 1].length() < surnames[smallWord].length()) {
                    smallWord = count + 1;
                }
            }
        }
        return surnames[smallWord];
    }

    // Check if any of the names in the array is repeated, if yes return true else false

    /**
     * It checks if the names are repeated in the array
     *
     * @param names An array of strings that contains the names of the people in the group.
     * @return The method is returning a boolean value.
     */
    public boolean checkIfNamesAreRepeated(String[] names) {
        boolean flag = false;
        for (int index = 0; index <= names.length - 1; index++) {
            for (int count = index + 1; count <= names.length - 1; count++) {
                if (names[index].equals(names[count])) {
                    if (index == count) {
                        flag = false;
                        break;
                    } else {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    // Concatenate the name and surname of the students

    /**
     * Given two arrays of strings, return an array of strings where each element is the concatenation of the corresponding
     * elements of the two input arrays.
     *
     * @param studentNames   an array of Strings containing the names of the students
     * @param studentSurname an array of strings containing the surnames of the students
     * @return The method is returning an array of strings.
     */
    public String[] concatenateNameAndSurname(String[] studentNames, String[] studentSurname) {
        String[] concatenatedNames = new String[studentNames.length];
        for (int index = 0; index < studentNames.length; index++) {
            concatenatedNames[index] = studentNames[index].concat(" " + studentSurname[index]);
        }
        return concatenatedNames;
    }

    // Display the names

    /**
     * The function takes in an array of strings, and prints out the array
     *
     * @param namesArray This is the array that will be passed into the method.
     */
    public void displayStudentNames(String[] namesArray) {
        System.out.println(Arrays.toString(namesArray));
    }
}