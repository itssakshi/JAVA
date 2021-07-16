import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Q13E {
    JButton btnClose;
    JPanel panelForm;
    JLabel labelName, labelCourse, labelRollNo, labelCollege;
    JTextField fieldName, fieldCourse, fieldRollNo, fieldCollege;
    Q13E(String name, String course, String rollNo, String college) {
        JFrame frame = new JFrame("Personal Information");
        labelName = new JLabel("Name:");
        labelName.setBounds(30, 30, 90, 23);
        labelCourse = new JLabel("Course:");
        labelCourse.setBounds(30, 60, 100, 23);
        labelRollNo = new JLabel("Roll No.:");
        labelRollNo.setBounds(30, 90, 80, 23);
        labelCollege = new JLabel("College:");
        labelCollege.setBounds(30, 120, 90, 23);
        fieldName = new JTextField(name);
        fieldName.setBounds(120, 30, 210, 23);
        fieldName.setEditable(false);
        fieldCourse = new JTextField(course);
        fieldCourse.setBounds(120, 60, 210, 23);
        fieldCourse.setEditable(false);
        fieldRollNo = new JTextField(rollNo);
        fieldRollNo.setBounds(120, 90, 210, 23);
        fieldRollNo.setEditable(false);
        fieldCollege = new JTextField(college);
        fieldCollege.setBounds(120, 120, 210, 23);
        fieldCollege.setEditable(false);
        btnClose = new JButton("Close");
        btnClose.setBounds(110, 160, 140, 30);
        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        panelForm = new JPanel();
        panelForm.setLayout(null);
        panelForm.add(labelName);
        panelForm.add(fieldName);
        panelForm.add(labelCourse);
        panelForm.add(fieldCourse);
        panelForm.add(labelRollNo);
        panelForm.add(fieldRollNo);
        panelForm.add(labelCollege);
        panelForm.add(fieldCollege);
        panelForm.add(btnClose);
        frame.add(panelForm);
        frame.setSize(380, 250);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}