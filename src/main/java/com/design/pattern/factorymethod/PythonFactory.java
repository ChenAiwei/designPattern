package com.design.pattern.factorymethod;

/**
 * @Author：chenaiwei
 * @Description：PythonFactory
 * @CreateDate：2021/3/23 10:23
 */
public class PythonFactory extends VideoFactory {
	@Override
	Video getVideo() {
		return new PythonVideo();
	}
}
