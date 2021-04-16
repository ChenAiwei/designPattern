package com.design.pattern.abstractfactory;

/**
 * @Author：chenaiwei
 * @Description：CourseFactory
 * @CreateDate：2021/4/7 10:36
 */
public interface CourseFactory {
	Article makeArticle();
	Video makeVideo();
}
