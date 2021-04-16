package com.design.pattern.abstractfactory;

/**
 * @Author：chenaiwei
 * @Description：JavaCourseFactory
 * @CreateDate：2021/4/7 10:41
 */
public class JavaCourseFactory implements CourseFactory {
	@Override
	public Article makeArticle() {
		return new JavaArticle();
	}

	@Override
	public Video makeVideo() {
		return new JavaVideo();
	}
}
