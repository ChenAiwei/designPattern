package com.design.pattern.abstractfactory;

/**
 * @Author：chenaiwei
 * @Description：PythonCourseFactory
 * @CreateDate：2021/4/7 10:44
 */
public class PythonCourseFactory implements CourseFactory {
	@Override
	public Article makeArticle() {
		return new PythonArticle();
	}

	@Override
	public Video makeVideo() {
		return new PythonVideo();
	}
}
