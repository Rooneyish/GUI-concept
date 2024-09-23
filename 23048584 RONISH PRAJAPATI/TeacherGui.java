// Importing required files for the Project
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;

// Creating class for GUI
public class TeacherGui {
    // Initializing required JTextfields, JComboBox and ArrayList
    private JTextField tId;
    private JTextField tName;
    private JTextField tAddress;
    private JTextField tWorkingHours;
    private JTextField tDepartment;
    private JTextField tYearsOfExp;
    private JTextField tGradedScore;
    private JTextField tSalary;
    private JTextField tSpecialization;
    private JTextField tAcademicQualification;
    private JComboBox<Integer> tPerformanceIndex;
    private JComboBox<String> tWorkingType;
    private ArrayList<teacher> teacherList= new ArrayList<>();
    
    public void mainGui() {
        /*Method for creating GUI*/
        JFrame frame = new JFrame("Teacher Management System"); // Main frame for the system
        
        // Setting size layout and visibility
        frame.setSize(1920,1080);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        /*TEACHER PANEL*/
        // Setting Panel for teacher
        JPanel teacherPanel = new JPanel();
        teacherPanel.setLayout(new BorderLayout());
        frame.add(teacherPanel);
        
        // Creating Font
        Font font30 = new Font("Cooper Black", Font.BOLD, 70);
        Font font20 = new Font("Comic Sans MS", Font.BOLD, 24);

        // Creating Color
        Color pink = new Color(245, 218, 210);
        Color green = new Color(117, 164, 127);
        Color light = new Color(252, 255, 224);
        
        // Creating JPanel
        JPanel headerPanel = new JPanel();
        JPanel mainPanelOuter = new JPanel();
        JPanel mainPanelInner = new JPanel();
        JPanel employmentPanel = new JPanel();
        JPanel frame1Buttons = new JPanel();
        JPanel frame1ButtonsOuter = new JPanel();
        
        // Setting BackGround color
        mainPanelInner.setBackground(pink);
        mainPanelOuter.setBackground(pink);
        headerPanel.setBackground(pink);
        employmentPanel.setBackground(pink);
        frame1Buttons.setBackground(pink);
        frame1ButtonsOuter.setBackground(pink);
        
        // Creating JLabel
        JLabel header = new JLabel("Teacher Management System");
        JLabel id = new JLabel("ID");
        JLabel name = new JLabel("Name");
        JLabel address = new JLabel("Address");
        JLabel workingType = new JLabel("Working Type");
        JLabel employStatus = new JLabel("Employment Status");
        JLabel workingHours = new JLabel("Working Hours");
        
        // Creating JButton
        JButton lecturerButton = new JButton("Lecturer");
        JButton tutorButton = new JButton("Tutor");
        JButton clearButton = new JButton("Clear");
        JButton display = new JButton("Display");
        
        // Setting BackGround Color
        lecturerButton.setBackground(green);
        tutorButton.setBackground(green);
        clearButton.setBackground(green);
        display.setBackground(green);
        
        // Setting ForeGround Color
        lecturerButton.setForeground(light);
        tutorButton.setForeground(light);
        clearButton.setForeground(light);
        display.setForeground(light);
        
        // Setting Font
        lecturerButton.setFont(font20);
        tutorButton.setFont(font20);
        clearButton.setFont(font20);
        display.setFont(font20);
        
        // Setting ForeGround
        header.setForeground(green);
        id.setForeground(green);
        name.setForeground(green);
        address.setForeground(green);
        workingType.setForeground(green);
        employStatus.setForeground(green);
        workingHours.setForeground(green);
        
        // Setting Layout
        headerPanel.setLayout(new FlowLayout());
        frame1Buttons.setLayout(new FlowLayout());
        mainPanelInner.setLayout(new GridLayout(8, 2, 30, 5));
        mainPanelOuter.setLayout(new FlowLayout());
        frame1ButtonsOuter.setLayout(new FlowLayout());
        
        // Creating JTextFields
        tId = new JTextField();
        tName = new JTextField();
        tAddress = new JTextField();
        tWorkingHours = new JTextField();
        
        // Creating and adding values to JComboBox
        String[] workType = { "Full-Time", "Part-Time", "Intern" };
        tWorkingType = new JComboBox<>(workType);
        
        // Creating JRadioButton
        employmentPanel.setLayout(new FlowLayout(FlowLayout.LEADING));
        JRadioButton permanent = new JRadioButton("Permanent");
        JRadioButton temporary = new JRadioButton("Temporary");
        
        // Setting BackGround
        permanent.setBackground(pink);
        temporary.setBackground(pink);
        
        // Setting ForeGround
        permanent.setForeground(green);
        temporary.setForeground(green);
        
        // Adding objects to the Teacher Panel
        teacherPanel.add(headerPanel, BorderLayout.NORTH);
        teacherPanel.add(frame1ButtonsOuter, BorderLayout.SOUTH);
        frame1ButtonsOuter.add(frame1Buttons);
        headerPanel.add(header);
        teacherPanel.add(mainPanelOuter, BorderLayout.CENTER);
        mainPanelOuter.add(mainPanelInner);
        employmentPanel.add(permanent);
        employmentPanel.add(temporary);
        mainPanelInner.add(id);
        mainPanelInner.add(name);
        mainPanelInner.add(tId);
        mainPanelInner.add(tName);
        mainPanelInner.add(address);
        mainPanelInner.add(workingType);
        mainPanelInner.add(tAddress);
        mainPanelInner.add(tWorkingType);
        mainPanelInner.add(employStatus);
        mainPanelInner.add(workingHours);
        mainPanelInner.add(employmentPanel);
        mainPanelInner.add(tWorkingHours);
        teacherPanel.add(frame1ButtonsOuter, BorderLayout.SOUTH);
        frame1Buttons.add(lecturerButton);
        frame1Buttons.add(tutorButton);
        frame1Buttons.add(display);
        frame1Buttons.add(clearButton);
        
        // Setting Font
        header.setFont(font30);
        id.setFont(font20);
        name.setFont(font20);
        address.setFont(font20);
        workingType.setFont(font20);
        employStatus.setFont(font20);
        workingHours.setFont(font20);
        tWorkingType.setFont(font20);
        tId.setFont(font20);
        tName.setFont(font20);
        tAddress.setFont(font20);
        tWorkingHours.setFont(font20);
        permanent.setFont(font20);
        temporary.setFont(font20);
        
        // Setting ForeGround and BackGround
        tWorkingType.setForeground(green);
        tId.setForeground(green);
        tName.setForeground(green);
        tAddress.setForeground(green);
        tWorkingHours.setForeground(green);
        
        tId.setBackground(light);
        tName.setBackground(light);
        tWorkingType.setBackground(light);
        tAddress.setBackground(light);
        tWorkingHours.setBackground(light);
        
        // Setting Empty Border
        mainPanelInner.setBorder(BorderFactory.createEmptyBorder(120, 0, 0, 0));
        headerPanel.setBorder(BorderFactory.createEmptyBorder(50, 0, 0, 0));
        frame1Buttons.setBorder(BorderFactory.createEmptyBorder(0, 0, 180, 0));
        
        /*LECTURER PANEL*/
        
        // Creating JPanel 
        JPanel lecturerPanel = new JPanel();
        JPanel lecturerHeaderP = new JPanel();
        JPanel mainLecturer = new JPanel();
        JPanel mainInnerL = new JPanel();
        JPanel frame2ButtonsOuter = new JPanel();
        JPanel frame2Buttons = new JPanel();
        JPanel innerButtons = new JPanel(new FlowLayout());
        
        // Setting Layout to JPanel
        lecturerPanel.setLayout(new BorderLayout());
        lecturerHeaderP.setLayout(new FlowLayout());
        mainLecturer.setLayout(new FlowLayout());
        frame2Buttons.setLayout(new GridLayout(2, 1));
        mainInnerL.setLayout(new GridLayout(7, 1,30,10));
        
        // Setting BackGround
        lecturerPanel.setBackground(pink);
        lecturerHeaderP.setBackground(pink);
        mainLecturer.setBackground(pink);
        mainInnerL.setBackground(pink);
        frame2Buttons.setBackground(pink);
        frame2ButtonsOuter.setBackground(pink);
        innerButtons.setBackground(pink);
        
        // Creating JLabel
        JLabel lecturerHeader = new JLabel("Lecturer");
        JLabel department = new JLabel("Department");
        JLabel yearsOfExp = new JLabel("Years Of Experience");
        JLabel gradedScore = new JLabel("Graded Score");
        
        // Creating JTextFields
        tDepartment = new JTextField();
        tYearsOfExp = new JTextField();
        tGradedScore = new JTextField();
        
        // Setting BackGround
        tDepartment.setBackground(light);
        tYearsOfExp.setBackground(light);
        tGradedScore.setBackground(light);
        
        // Setting ForeGround
        tDepartment.setForeground(green);
        tYearsOfExp.setForeground(green);
        tGradedScore.setForeground(green);
        
        // Setting Font
        tDepartment.setFont(font20);
        tYearsOfExp.setFont(font20);
        tGradedScore.setFont(font20);
        
        // Creating JButton
        JButton addLecturer = new JButton("Add Lecturer");
        JButton gradeAssignment = new JButton("Grade Assignment");
        JButton home1 = new JButton("Home");
        JButton clearButton1= new JButton("Clear");
        
        // Setting BackGround
        addLecturer.setBackground(green);
        gradeAssignment.setBackground(green);
        home1.setBackground(green);
        clearButton1.setBackground(green);
        
        // Setting ForeGround
        addLecturer.setForeground(light);
        gradeAssignment.setForeground(light);
        home1.setForeground(light);
        clearButton1.setForeground(light);
        
        // Setting Font
        addLecturer.setFont(font20);
        gradeAssignment.setFont(font20);
        home1.setFont(font20);
        clearButton1.setFont(font20);
        
        // Setting ForeGround
        lecturerHeader.setForeground(green);
        department.setForeground(green);
        yearsOfExp.setForeground(green);
        gradedScore.setForeground(green);
        
        // Adding objects to the Lecturer Panel
        frame.add(lecturerPanel);
        lecturerPanel.add(lecturerHeaderP, BorderLayout.NORTH);
        lecturerHeaderP.add(lecturerHeader);
        lecturerPanel.add(mainLecturer);
        mainLecturer.add(mainInnerL);
        mainInnerL.add(department);
        mainInnerL.add(tDepartment);
        mainInnerL.add(yearsOfExp);
        mainInnerL.add(tYearsOfExp);
        mainInnerL.add(gradedScore);
        mainInnerL.add(tGradedScore);
        frame2ButtonsOuter.add(frame2Buttons);
        lecturerPanel.add(frame2ButtonsOuter, BorderLayout.SOUTH);
        frame2Buttons.add(innerButtons);
        innerButtons.add(addLecturer);
        innerButtons.add(gradeAssignment);
        innerButtons.add(home1);
        innerButtons.add(clearButton1);
        
        // Setting Size for JTextFields
        tDepartment.setPreferredSize(new Dimension(300, 50));
        tYearsOfExp.setPreferredSize(new Dimension(300, 50));
        tGradedScore.setPreferredSize(new Dimension(300, 50));

        // Setting Size for JButtons
        addLecturer.setPreferredSize(new Dimension(200, 50));
        gradeAssignment.setPreferredSize(new Dimension(300, 50));
        home1.setPreferredSize(new Dimension(200, 50));
        clearButton1.setPreferredSize(new Dimension(200, 50));
    
        // Setting Font
        lecturerHeader.setFont(font30);
        department.setFont(font20);
        yearsOfExp.setFont(font20);
        gradedScore.setFont(font20);
        
        // Setting Empty Border
        mainInnerL.setBorder(BorderFactory.createEmptyBorder(120, 0, 0, 0));
        lecturerHeaderP.setBorder(BorderFactory.createEmptyBorder(50, 0, 0, 0));
        frame2Buttons.setBorder(BorderFactory.createEmptyBorder(0, 0, 50, 0));
        

        /*TUTOR PANEL*/
        // Creating new JPanel
        JPanel tutorPanel=new JPanel();
        JPanel tutorHeaderP= new JPanel();
        JPanel mainTutor= new JPanel();
        JPanel mainInnerTu= new JPanel();
        JPanel frame3ButtonsOuter= new JPanel();
        JPanel frame3Buttons= new JPanel();
        JPanel innerButtonsTu= new JPanel(new FlowLayout());
        
        // Setting BackGround
        tutorPanel.setBackground(pink);
        tutorHeaderP.setBackground(pink);
        mainTutor.setBackground(pink);
        mainInnerTu.setBackground(pink);
        frame3Buttons.setBackground(pink);
        frame3ButtonsOuter.setBackground(pink);
        innerButtonsTu.setBackground(pink);
        
        // Setting Layout
        tutorPanel.setLayout(new BorderLayout());
        tutorHeaderP.setLayout(new FlowLayout());
        mainTutor.setLayout(new FlowLayout());
        mainInnerTu.setLayout(new GridLayout(9,1, 30 ,5));
        frame3Buttons.setLayout(new GridLayout(2,1));
        
        // Creating JLabel
        JLabel tutorHeader= new JLabel("Tutor");
        JLabel salary= new JLabel("Salary");
        JLabel specialization= new JLabel("Specialization");
        JLabel academicQualification= new JLabel("Academic Qualification");
        JLabel performanceIndex= new JLabel("Performance Index");
        
        // Setting ForeGround
        tutorHeader.setForeground(green);
        salary.setForeground(green);
        specialization.setForeground(green);
        academicQualification.setForeground(green);
        performanceIndex.setForeground(green);
        
        // Creating JTextFields
        tSalary= new JTextField();
        tSpecialization= new JTextField();
        tAcademicQualification= new JTextField();
        
        // Creating and setting values for JComboBox
        Integer[] index= new Integer[11];
        for(int i=0;i<=10;i++){
            index[i]=i;
        }
        tPerformanceIndex = new JComboBox<>(index);
        
        // Setting BackGround
        tSalary.setBackground(light);
        tSpecialization.setBackground(light);
        tAcademicQualification.setBackground(light);
        tPerformanceIndex.setBackground(light);
        
        // Setting ForeGround
        tSalary.setForeground(green);
        tSpecialization.setForeground(green);
        tAcademicQualification.setForeground(green);
        tPerformanceIndex.setForeground(green);
        
        // Creating Button
        JButton addTutor= new JButton("Add Tutor");
        JButton setSalary= new JButton("Set Salary");
        JButton removeTutor= new JButton("Remove Tutor");
        JButton home2= new JButton("Home");
        JButton clearButton2= new JButton("Clear");
        
        // Setting BackGround
        addTutor.setBackground(green);
        setSalary.setBackground(green);
        removeTutor.setBackground(green);
        home2.setBackground(green);
        clearButton2.setBackground(green);
        
        // Setting ForeGround
        addTutor.setForeground(light);
        setSalary.setForeground(light);
        removeTutor.setForeground(light);
        home2.setForeground(light);
        clearButton2.setForeground(light);
        
        // Setting Font
        addTutor.setFont(font20);
        setSalary.setFont(font20);
        removeTutor.setFont(font20);
        home2.setFont(font20);
        clearButton2.setFont(font20);
        
        // Adding objects to the Tutor Panel
        frame.add(tutorPanel);
        tutorPanel.add(tutorHeaderP, BorderLayout.NORTH);
        tutorHeaderP.add(tutorHeader);
        tutorPanel.add(mainTutor);
        mainTutor.add(mainInnerTu);
        mainInnerTu.add(salary);
        mainInnerTu.add(tSalary);
        mainInnerTu.add(specialization);
        mainInnerTu.add(tSpecialization);
        mainInnerTu.add(academicQualification);
        mainInnerTu.add(tAcademicQualification);
        mainInnerTu.add(performanceIndex);
        mainInnerTu.add(tPerformanceIndex);
        tutorPanel.add(frame3ButtonsOuter, BorderLayout.SOUTH);
        frame3ButtonsOuter.add(frame3Buttons);
        frame3Buttons.add(innerButtonsTu);
        innerButtonsTu.add(addTutor);
        innerButtonsTu.add(setSalary);
        innerButtonsTu.add(removeTutor);
        innerButtonsTu.add(home2);
        innerButtonsTu.add(clearButton2);
        
        // Setting Size for JTextFields
        tSalary.setPreferredSize(new Dimension(300, 50));
        tSpecialization.setPreferredSize(new Dimension(300, 50));
        tAcademicQualification.setPreferredSize(new Dimension(300, 50));
        tPerformanceIndex.setPreferredSize(new Dimension(300, 50));
        
        // Setting Size for JButtons
        addTutor.setPreferredSize(new Dimension(200, 50));
        setSalary.setPreferredSize(new Dimension(200, 50));
        removeTutor.setPreferredSize(new Dimension(200, 50));
        home2.setPreferredSize(new Dimension(200, 50));
        clearButton2.setPreferredSize(new Dimension(200, 50));
        
        // Setting Font
        tutorHeader.setFont(font30);
        salary.setFont(font20);
        specialization.setFont(font20);
        academicQualification.setFont(font20);
        performanceIndex.setFont(font20);
        
        tSalary.setFont(font20);
        tSpecialization.setFont(font20);
        tAcademicQualification.setFont(font20);
        tPerformanceIndex.setFont(font20);
        
        // Setting Empty Border
        mainInnerTu.setBorder(BorderFactory.createEmptyBorder(70, 0, 0, 0));
        tutorHeaderP.setBorder(BorderFactory.createEmptyBorder(50, 0, 0, 0));
        frame3Buttons.setBorder(BorderFactory.createEmptyBorder(0, 0, 50, 0));
        
        // Setting the visiblity of Panels
        tutorPanel.setVisible(false);
        lecturerPanel.setVisible(false);
        
        /*EVENT HANDLING*/
        
        // Event Handling when the user clicks on clear button
        clearButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e){
            clear();
           } 
        });
        clearButton1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                clear();
            }
        });
        clearButton2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                clear();
            }
        });
        
        // When the user cliks on add Lecturer button this function add a new Lecturer to teacherList
        addLecturer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try{
                    int lecturerId= Integer.parseInt(tId.getText());

                    boolean exists= false;
                    for(teacher each: teacherList){
                        if(each.getTeacher_id()==lecturerId){
                            exists=true;
                            break;
                        }
                    }

                    if(exists==true){
                        JOptionPane.showMessageDialog(frame,"This ID number already exists, Please enter a new ID!!","Alert", JOptionPane.WARNING_MESSAGE);
                        clear();
                        return;
                    }
                    String lecturerName= tName.getText();
                    String lecturerAddress= tAddress.getText();
                    String lecturerWorkingType=tWorkingType.getSelectedItem().toString();
                    String lecturerEmployStatus;
                    if(permanent.isSelected()){
                        lecturerEmployStatus="Permanent";
                    }
                    else{
                        lecturerEmployStatus="Temporary";
                    }
                    int lecturerHours=Integer.parseInt(tWorkingHours.getText());

                    String lecturerDepartment= tDepartment.getText();
                    int lecturerYearOfExp=Integer.parseInt(tYearsOfExp.getText());
                    int lecturerGradedScore=Integer.parseInt(tGradedScore.getText());

                    teacher newLecturer = new lecturer(lecturerId, lecturerName, lecturerAddress, lecturerWorkingType, lecturerEmployStatus, lecturerDepartment, lecturerHours, lecturerYearOfExp, lecturerGradedScore);
                    teacherList.add(newLecturer);
                    clear();
                    JOptionPane.showMessageDialog(frame,"Lecturer Successfully added!!", "Information", JOptionPane.INFORMATION_MESSAGE);
                }
                catch(NumberFormatException g){
                    JOptionPane.showMessageDialog(frame,"Please provide a valid value!!!", "Alert", JOptionPane.WARNING_MESSAGE);
                    clear();
                }
                }
        });
        
        
        // When the user cliks on add Lecturer button this function add a new Lecturer to teacherList
        addTutor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try{
                    int tutorId= Integer.parseInt(tId.getText());

                    boolean exists= false;
                    for(teacher each: teacherList){
                        if(each.getTeacher_id()==tutorId){
                            exists=true;
                            break;
                        }
                    }

                    if(exists==true){
                        JOptionPane.showMessageDialog(frame,"This ID number already exists, Please enter a new ID!!","Alert", JOptionPane.WARNING_MESSAGE);
                        clear();
                        return;
                    }
                    String tutorName= tName.getText();
                    String tutorAddress= tAddress.getText();
                    String tutorWorkingType= tWorkingType.getSelectedItem().toString();
                    String tutorEmployStatus;
                    if(permanent.isSelected()){
                        tutorEmployStatus="Permanent";
                    }else if(temporary.isSelected()){
                        tutorEmployStatus="Temporary";
                    }else{
                        tutorEmployStatus="";
                    }
                    int tutorHours= Integer.parseInt(tWorkingHours.getText());

                    double tutorSalary=Double.parseDouble(tSalary.getText());
                    String tutorSpecialization=tSpecialization.getText();
                    String tutorAcademicQualification=tAcademicQualification.getText();
                    int tutorPerformanceIndex=(Integer)tPerformanceIndex.getSelectedItem();

                    teacher newTutor= new tutor(tutorId, tutorName, tutorAddress, tutorWorkingType, tutorEmployStatus,tutorHours,tutorSalary,tutorSpecialization,tutorAcademicQualification, tutorPerformanceIndex);
                    teacherList.add(newTutor);
                    clear();
                    JOptionPane.showMessageDialog(frame,"Tutor Successfully added!!", "Information", JOptionPane.INFORMATION_MESSAGE);
                }
                catch(NumberFormatException g){
                    JOptionPane.showMessageDialog(frame,"Please provide a valid value!!!", "Alert", JOptionPane.WARNING_MESSAGE);
                    clear();
                }
            }
        });
        
        // functions to switch Panels
        tutorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherPanel.setVisible(false);
                lecturerPanel.setVisible(false);
                tutorPanel.setVisible(true);
            }
        });
        lecturerButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                teacherPanel.setVisible(false);
                tutorPanel.setVisible(false);
                lecturerPanel.setVisible(true);
            }
        });

        home1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                lecturerPanel.setVisible(false);
                teacherPanel.setVisible(true);
            }
        });
        home2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                tutorPanel.setVisible(false);
                teacherPanel.setVisible(true);
            }
        });

        // Function that displays details of teachers when clicked
        display.addActionListener(new  ActionListener() {
            public void actionPerformed(ActionEvent e){
                try{
                    String Id_String = JOptionPane.showInputDialog(frame,"Enter the Id of the teacher to see details: ");
                    if(Id_String==""){
                        JOptionPane.showMessageDialog(frame,"Please enter the Id of the teacher!!!", "Warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    int teacherId=Integer.parseInt(Id_String);
                    boolean found = false;
                    for (teacher each : teacherList) {
                        if (each.getTeacher_id() == teacherId) {
                            found = true;
                            if (each instanceof tutor) {
                                tutor Tutor = (tutor) each;
                                String tutorDisplay = "Tutor Details: " + "\nTutor Id: " + Tutor.getTeacher_id() + "\n\nTutor Name: " + Tutor.getTeacher_name() + "\n\nAddress: " + Tutor.getAddress() + "\n\nWorking Type: " + Tutor.getWorking_type() + "\n\nEmployment Status: " + Tutor.getEmployment_status() + "\n\nSalary: " + Tutor.getSalary() + "\n\nAcademic Qualification: " + Tutor.getAcademic_qualification() + "\n\nPerformance Index: " + Tutor.getPerformanceIndex();
                                JOptionPane.showMessageDialog(frame, tutorDisplay,"Information",JOptionPane.PLAIN_MESSAGE);
                            } else if (each instanceof lecturer) {
                                lecturer Lecturer = (lecturer) each;
                                String lecturerDisplay = "Lecturer Details: " + "\nTutor Id: " + Lecturer.getTeacher_id() + "\n\nTutor Name: " + Lecturer.getTeacher_name() + "\n\nAddress: " + Lecturer.getAddress() + "\n\nWorking Type: " + Lecturer.getWorking_type() + "\n\nEmployment Status: " + Lecturer.getEmployment_status() + "\n\nDepartment: " + Lecturer.getDepartment() + "\n\nYears Of Experience: " + Lecturer.getYearsOfExperience() + "\n\nGraded Score: " + Lecturer.getGradedScore();
                                JOptionPane.showMessageDialog(frame, lecturerDisplay,"Information",JOptionPane.PLAIN_MESSAGE);
                            }
                        break;
                        }
                    }
                    if (found == false) {
                    JOptionPane.showMessageDialog(frame, "Teacher not found with ID: " + teacherId);
                    }
                }
                catch(NumberFormatException g){
                    JOptionPane.showMessageDialog(frame,"Please provide a valid value!!!", "Alert", JOptionPane.WARNING_MESSAGE);
                    clear();
                }
            }
        });

        // Function that removes tutor when clicked
        removeTutor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    String tutorIdString = JOptionPane.showInputDialog(frame, "Enter the Id of the tutor to remove:");
    
                    if (tutorIdString=="") {
                        JOptionPane.showMessageDialog(frame, "Please enter the Id of the tutor to remove!!!", "Warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    }

                    int tutorId=Integer.parseInt(tutorIdString);
                    boolean tutorFound = false;
                    for (teacher each:teacherList) {
                        if (each instanceof tutor) {
                            tutor currentTutor = (tutor) each;
                            if (currentTutor.getTeacher_id()==tutorId) {
                                currentTutor.removeTutor();
                                tutorFound = true;
                                JOptionPane.showMessageDialog(frame, "Tutor removed successfully.", "Information", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            }
                        }
                    }
                
                    if (tutorFound==false) {
                        JOptionPane.showMessageDialog(frame, "Tutor with the provided Id not found.", "Alert", JOptionPane.WARNING_MESSAGE);
                    }
                }
                catch(NumberFormatException g){
                    JOptionPane.showMessageDialog(frame,"Please provide a valid value!!!", "Alert", JOptionPane.WARNING_MESSAGE);
                    clear();
                }
                
            }
        });
        
        // function that sets new Salary when clicked
        setSalary.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    String tutorIdString= JOptionPane.showInputDialog(frame,"Enter Id of the Tutor to set new Salary: ");

                    if(tutorIdString==""){
                        JOptionPane.showMessageDialog(frame,"Please enter the Id of the Tutor to set new Salary!!!", "Alert", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    int tutorId=Integer.parseInt(tutorIdString);
                    boolean tutorFound=false;
                
                    for(teacher each: teacherList){
                        if(each instanceof tutor){
                            tutor currentTutor=(tutor)each;
                            if(currentTutor.getTeacher_id()==tutorId){
                                tutorFound=true;
                                String SalaryString=JOptionPane.showInputDialog(frame,"Enter new Salary for "+currentTutor.getTeacher_name()+": ");
                                String PerformanceIndexString=JOptionPane.showInputDialog(frame,"Enter new Performance Index for "+currentTutor.getTeacher_name()+": ");
                                
                                if(SalaryString=="" || PerformanceIndexString==""){
                                    JOptionPane.showMessageDialog(frame,"Please enter the value of new Salary!!!", "Alert", JOptionPane.WARNING_MESSAGE);
                                    return;
                                }
                            
                                double newSalary=Double.parseDouble(SalaryString);
                                int newPerformanceIndex= Integer.parseInt(PerformanceIndexString);
                            
                                currentTutor.setSalary(newSalary, newPerformanceIndex);
                                
                                JOptionPane.showMessageDialog(frame,"New Salary and Performance Index is Updated.","Information",JOptionPane.INFORMATION_MESSAGE);
                                break; 
                            }
                        }
                    if(tutorFound==false){
                        JOptionPane.showMessageDialog(frame,"Tutor not found please enter correct name!!!","Alert",JOptionPane.WARNING_MESSAGE);
                    }}
                }
                catch(NumberFormatException g){
                    JOptionPane.showMessageDialog(frame,"Please provide a valid value!!!", "Alert", JOptionPane.WARNING_MESSAGE);
                    clear();
                }
                
            }
        });
        
        // function that grade assignment of the Lecturer when clicked
        gradeAssignment.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e){
            try{
                String lecturerIdString=JOptionPane.showInputDialog(frame,"Enter the Id of the Lecturer: ");
                String department=JOptionPane.showInputDialog(frame,"Enter the Department of the Lecturer: ");
                String YOFString=JOptionPane.showInputDialog(frame,"Enter the Years of Experience of the Lecturer: " );
                String GradeString=JOptionPane.showInputDialog(frame, "Enter the Graded Score of the Lecturer: ");
                if(GradeString=="" ||lecturerIdString==""||department==""||YOFString==""){
                    JOptionPane.showMessageDialog(frame,"Incomplete Input!!!","Alert",JOptionPane.WARNING_MESSAGE);
                    return;
                }
                int lecturerId= Integer.parseInt(lecturerIdString);
                int YOF=Integer.parseInt(YOFString);
                int GradedScore=Integer.parseInt(GradeString);
                boolean lecturerFound=false;
                for(teacher each:teacherList){
                    if(each instanceof lecturer){
                        lecturer currentLecturer=(lecturer)each;
                        if(currentLecturer.getTeacher_id()==lecturerId){
                            String Grade=currentLecturer.gradeAssignment(GradedScore,department,YOF);
                            lecturerFound=true;
                            JOptionPane.showMessageDialog(frame,currentLecturer.getTeacher_name()+"'s grade is: "+Grade);
                            break;
                        }
                    }
                }
                if(lecturerFound==false){
                    JOptionPane.showMessageDialog(frame,"Lecturer with the provided Id not found", "Alert",JOptionPane.WARNING_MESSAGE);
                }
            }
            catch(NumberFormatException g){
                JOptionPane.showMessageDialog(frame,"Please provide a valid value!!!", "Alert", JOptionPane.WARNING_MESSAGE);
                clear();
            }
            
           } 
        });
        
    }
    
    // Method to clear text fields
    public void clear(){
        tId.setText("");
        tName.setText("");
        tAddress.setText("");
        tWorkingHours.setText("");
        tDepartment.setText("");
        tYearsOfExp.setText("");
        tAcademicQualification.setText("");
        tGradedScore.setText("");
        tSalary.setText("");
        tSpecialization.setText("");
        tPerformanceIndex.setSelectedIndex(0);
        tWorkingType.setSelectedIndex(0);
    }
    
    // main method of the class
    public static void main(String[] args) {
        TeacherGui obj = new TeacherGui();
        obj.mainGui();
    }
}