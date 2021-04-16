package com.design.pattern.prototype;

/**
 * @Author：chenaiwei
 * @Description：Test
 * @CreateDate：2021/4/8 15:36
 * 使用原型模式注意原型的对象的属性如果是引用类型的话，需要重写该属性字段的clone，避免浅拷贝的问题
 */
public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		Email email = new Email();
		for (int i = 0;i<5;i++){
			Email mailTemp = (Email) email.clone();
			mailTemp.setAddress("地址："+i+"@163.com");
			mailTemp.setName("姓名："+i);
			mailTemp.setContent("内容："+i*Math.random());
			System.out.println(" = " + mailTemp + "," + "当前类=Test.main()");
		}
	}
}
