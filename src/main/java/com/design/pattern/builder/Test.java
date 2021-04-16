package com.design.pattern.builder;

/**
 * @Author：chenaiwei
 * @Description：Test
 * @CreateDate：2021/4/7 11:24
 */
public class Test {
	public static void main(String[] args) {
		/*Course build = new Course.CourseBuilder().buildName("java").buildType("it").buildPrice(20d).build();
		System.out.println(" = " + build.toString() + "," + "当前类=Test.main()");*/
		long round = Math.round(1800 / 1500d) == 0?1:(Math.round(1800 / 1500d));
		System.out.println( 1427/1500d );
	}
}
