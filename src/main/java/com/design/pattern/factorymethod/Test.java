package com.design.pattern.factorymethod;

/**
 * @Author：chenaiwei
 * @Description：Test
 * @CreateDate：2021/3/23 10:24
 */
public class Test {
	public static void main(String[] args) {
		VideoFactory javaFactory = new JavaFactory();
		Video video = javaFactory.getVideo();
		video.produce();
	}
}
