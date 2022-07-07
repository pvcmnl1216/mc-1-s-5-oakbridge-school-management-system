package com.jap.marksevaluation;

import com.jap.marksevaluation.OakBridgeSchool;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class OakBridgeSchoolTest {

    String[] studentNames;
    String[] studentSurnames;
    OakBridgeSchool oakBridgeSchool;

    @Before
    public void setUp() {
        oakBridgeSchool = new OakBridgeSchool();
        studentNames = new String[]{"Michelle", "Kate", "Ann", "Tina", "Tom", "Sam", "Ria", "Pam", "Kate", "Leo"};
        studentSurnames = new String[]{"Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Martin", "Clark", "King"};
    }

    @After
    public void tearDown() {

        studentNames = null;
        studentSurnames = null;
        oakBridgeSchool = null;
    }


    @Test
    public void givenStringNameConvertToUpperCaseSuccess(){
        assertEquals("TIM",oakBridgeSchool.convertToUpperCase("tim"));
        assertEquals("CAREY",oakBridgeSchool.convertToUpperCase("cArEY"));
        assertEquals("MALCOLM",oakBridgeSchool.convertToUpperCase("Malcolm"));
        assertEquals("GARY JONES",oakBridgeSchool.convertToUpperCase("Gary Jones"));
    }
    @Test
    public void givenStringNameConvertToUpperCaseFailure(){
        assertEquals(" ",oakBridgeSchool.convertToUpperCase(""));
        assertEquals(" ",oakBridgeSchool.convertToUpperCase(new String()));
    }

    @Test
    public void givenSurnameArrayReturnShortestSurname(){
        assertEquals("King",oakBridgeSchool.shortestSurname(studentSurnames));
    }
    @Test
    public void givenNameArrayReturnTrueIfNamesAreRepeatedOrFalse(){
        assertTrue(oakBridgeSchool.checkIfNamesAreRepeated(studentNames));
        assertTrue(oakBridgeSchool.checkIfNamesAreRepeated(new String[]{"John","John","Anne","Pam"}));
        assertTrue(oakBridgeSchool.checkIfNamesAreRepeated(new String[]{"John","Gary","Anne","John"}));
        assertTrue(oakBridgeSchool.checkIfNamesAreRepeated(new String[]{"John","John","John","Pam"}));
        assertFalse(oakBridgeSchool.checkIfNamesAreRepeated(new String[]{"Mathew","John","Anne","Pam"}));
        assertFalse(oakBridgeSchool.checkIfNamesAreRepeated(new String[]{"John"}));
    }
}