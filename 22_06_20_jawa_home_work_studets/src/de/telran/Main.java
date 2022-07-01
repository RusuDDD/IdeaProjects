package de.telran;

import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	 /* создайте 2 класса. 1-й назовите Student. Он должен содержатъ в себе следуюшие аттрибутъ: номер студенческого билета, имя фамилию, год обучения,
        //средняя оценка по математике, средняя оценка по економике, средняя оценка по иностранномъ язъку. 2-й класс назовите StudentTest.
        //В нем въ должнъ будете создатъ3 разнъх объкета класса Student, въвести на екран в читабелъном виде средную арифметическую оценку
        //каждого студент (учитъвая все 3 предмета) */


        StudentsTest test = new StudentsTest();
        test.print(test.getStudet1());
        test.print(test.getStudet2());
        test.print(test.getStudet3());

        List<StudentsTest> studentsTestList = new ArrayList<>();
    }
}

