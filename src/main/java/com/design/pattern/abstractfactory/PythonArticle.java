package com.design.pattern.abstractfactory;

/**
 * @Author：chenaiwei
 * @Description：PythonArticle
 * @CreateDate：2021/4/7 10:46
 */
public class PythonArticle extends Article {

	@Override
	void produce() {
		System.out.println(" = " +  "生产python手记" + "当前类=PythonArticle.produce()");
	}
}
