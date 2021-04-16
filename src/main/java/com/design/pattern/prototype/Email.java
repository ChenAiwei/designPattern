package com.design.pattern.prototype;

/**
 * @Author：chenaiwei
 * @Description：Email
 * @CreateDate：2021/4/8 15:34
 */
public class Email implements Cloneable {

	private String name;
	private String address;
	private String content;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Email{" +
				"name='" + name + '\'' +
				", address='" + address + '\'' +
				", content='" + content + '\'' +
				'}'+super.toString();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
