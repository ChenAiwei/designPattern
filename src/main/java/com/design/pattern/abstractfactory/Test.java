package com.design.pattern.abstractfactory;

/**
 * @Author：chenaiwei
 * @Description：Test
 * @CreateDate：2021/4/7 10:43
 */
public class Test {
	public static void main(String[] args) {
		CourseFactory javaCourseFactory = new JavaCourseFactory();
		javaCourseFactory.makeArticle().produce();
		javaCourseFactory.makeVideo().produce();


		CourseFactory pythonCourseFactory = new PythonCourseFactory();
		pythonCourseFactory.makeArticle().produce();
		pythonCourseFactory.makeVideo().produce();
	}
}
