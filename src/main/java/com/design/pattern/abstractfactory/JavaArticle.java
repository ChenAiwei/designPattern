package com.design.pattern.abstractfactory;

/**
 * @Author：chenaiwei
 * @Description：JavaArticle
 * @CreateDate：2021/4/7 10:40
 */
public class JavaArticle extends Article {
	@Override
	public void produce() {
		System.out.println(" = "   + "生产java手记" + "当前类=JavaArticle.produce()");
	}
}
