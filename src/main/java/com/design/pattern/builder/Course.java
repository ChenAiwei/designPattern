package com.design.pattern.builder;

/**
 * @Author：chenaiwei
 * @Description：Course
 * @CreateDate：2021/4/7 11:19
 */
public class Course {
	private String name;
	private String type;
	private Double price;

	public Course(CourseBuilder courseBuilder) {
		this.name = courseBuilder.name;
		this.type = courseBuilder.type;
		this.price = courseBuilder.price;
	}

	@Override
	public String toString() {
		return "Course{" +
				"name='" + name + '\'' +
				", type='" + type + '\'' +
				", price=" + price +
				'}';
	}

	public static class CourseBuilder {
		private String name;
		private String type;
		private Double price;
		public CourseBuilder buildName(String name){
			this.name = name;
			return this;
		}
		public CourseBuilder buildType(String type){
			this.type = type;
			return this;
		}
		public CourseBuilder buildPrice(Double price){
			this.price = price;
			return this;
		}

		public Course build(){
			return new Course(this);
		}
	}
}
