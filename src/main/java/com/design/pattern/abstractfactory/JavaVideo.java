package com.design.pattern.abstractfactory;

/**
 * @Author：chenaiwei
 * @Description：JavaVideo
 * @CreateDate：2021/4/7 10:39
 */
public class JavaVideo extends Video {
	@Override
	public void produce() {
		System.out.println(" = " +  "生产java视频" + "当前类=JavaVideo.produce()");
	}
}
