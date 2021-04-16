package com.design.pattern.factorymethod;

/**
 * @Author：chenaiwei
 * @Description：JavaFactory
 * @CreateDate：2021/3/23 10:23
 */
public class JavaFactory extends VideoFactory {
	@Override
	Video getVideo() {
		return new JavaVideo();
	}
}
