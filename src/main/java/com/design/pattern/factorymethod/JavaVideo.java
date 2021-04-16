package com.design.pattern.factorymethod;

/**
 * @Author：chenaiwei
 * @Description：JavaVideo
 * @CreateDate：2021/3/23 10:21
 */
public class JavaVideo implements Video {
	@Override
	public void produce() {
		System.out.println(" = " + "java 课程" + "," + "当前类=JavaVideo.produce()");
	}
}
