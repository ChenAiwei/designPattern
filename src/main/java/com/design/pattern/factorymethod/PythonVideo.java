package com.design.pattern.factorymethod;

/**
 * @Author：chenaiwei
 * @Description：PythonVideo
 * @CreateDate：2021/3/23 10:22
 */
public class PythonVideo implements Video {
	@Override
	public void produce() {
		System.out.println(" = " + "python 课程" + "," + "当前类=PythonVideo.produce()");
	}
}
