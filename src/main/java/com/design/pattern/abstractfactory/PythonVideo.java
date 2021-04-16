package com.design.pattern.abstractfactory;

/**
 * @Author：chenaiwei
 * @Description：PythonVideo
 * @CreateDate：2021/4/7 10:45
 */
public class PythonVideo extends Video {
	@Override
	void produce() {
		System.out.println(" = "   + "生产python视频" + "当前类=PythonVideo.produce()");
	}
}
