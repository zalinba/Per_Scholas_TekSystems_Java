package com.perscholas.lab._21_reading_a_delimited_file;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//Lab 303.10.1 Reading a Delimited File

/* Create a class named MyRunner.
 */
public class MyRunner {
    public static void main(String[] args) throws FileNotFoundException {

        try {
//-----  change file path, as per your file location
            String location = "C:/Users/owner/Desktop/Powerpoints, lab, assignments, hackerrank, textbook/Lab Practice/CourseData.csv";
            File file = new File(location);
            Scanner input = new Scanner(file);
            ArrayList<Course> data = new ArrayList<Course>();

            while (input.hasNextLine()) {
                String Line = input.nextLine();
                String[] splitedLine = Line.split(",");
                // course cObj1 = new course(splitedLine[0], splitedLine[1], splitedLine[2]);
                Course cObj = new Course();
                cObj.setCode(splitedLine[0]);
                cObj.setCourse_name( splitedLine[1]);
                cObj.setInstructor_name(splitedLine[2]);

                data.add(cObj);
            }

            for (Course c : data) {
                System.out.println(c.getCode() + " | " + c.getCourse_name() + "|" + c.getInstructor_name());
                System.out.println("===============================");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found! ");
            e.printStackTrace();
        }
        /*Output:
        Course Code | Course Name|Instructor name
        ===============================
        CIS135 | Object-Oriented Programming |Michael Gabriel
        ===============================
        CIS235 | Object-oriented Programming II|Bairon Vasquez
        ===============================
        JIA254 | Java Full Stack|Haseeb
        ===============================
        JJA698 | Java Developer with HTML|Jafer
        ===============================
        RTP856 | React Developer|James Santana
        ===============================
         */

        /* Note: Do not forget to change the path or location of the file.
         */
    }

}
