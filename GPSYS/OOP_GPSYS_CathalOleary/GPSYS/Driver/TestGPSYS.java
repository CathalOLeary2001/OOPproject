package GPSYS.Driver;

import GPSYS.GUI.*;
import GPSYS.Ojects.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestGPSYS {

    //similar globals to Math.PI
    public static Doctor[] Doctors=new Doctor[4];
    public static ArrayList<Patient>Patients=new ArrayList<>();
    public static ArrayList<Appointment>Appointments=new ArrayList<>();

    //TestGPSYS.Patients.add(patient object);

    public static void main(String[] args) {


        //only going to have 4 doctors
        Doctor Doc1=new Doctor("Fred Smith",1);
        Doctor Doc4=new Doctor("Mark Twomey",4);
        Doctor Doc3=new Doctor("Mary Twomey",3);
        Doctor Doc2=new Doctor("James Walsh",2);

        Doctors[0]=Doc1;
        Doctors[1]=Doc2;
        Doctors[2]=Doc3;
        Doctors[3]=Doc4;

        Patient p3=new Patient("123451","123456789","kryst","lewa","0871234567",new GregorianCalendar(2000, Calendar.OCTOBER,28),"AB",Doc1);
        Patient p4=new Patient("123468","12156789","krasdfst","lasdfa","0871234567",new GregorianCalendar(2000, Calendar.OCTOBER,28),"AB",Doc1);
        Patients.add(p3);
        Patients.add(p4);
        //new RegPatientGUI();

        Appointment App1=new Appointment("17:00","17:30",p4);
        Appointment App2=new Appointment("18:00","18:30",p3);
        Appointments.add(App1);
        Appointments.add(App2);

        MainMenuGUI guiApp = new MainMenuGUI();
    }


}
