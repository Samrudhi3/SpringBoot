package com.tka.dao;

import java.util.ArrayList;

import com.tka.entity.FacultySubject;
public class StudentDao{
	

public ArrayList<FacultySubject> allfacsubjects() {
ArrayList<FacultySubject> al = new ArrayList<>();
FacultySubject fsl = new FacultySubject (11, "java");
FacultySubject fs2 = new FacultySubject (12, "react");
FacultySubject fs3 = new FacultySubject (13, "angular");
FacultySubject fs4 = new FacultySubject (14, "react");
al.add(fsl);
al.add(fs2);
al.add(fs3);
al.add(fs4);
return al;
}
}
