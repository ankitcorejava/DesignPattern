package com.builderdesignpattern;

public class BuilderDesignPattern {

	private int id;
	private String name;
	private String address;

	// Only getting and private constructor

	private BuilderDesignPattern(InnerBuilder innerBuilder) {
		this.id = innerBuilder.id;
		this.name = innerBuilder.name;
		this.address = innerBuilder.address;

	}
	
	

	@Override
	public String toString() {
		return "BuilderDesignPattern [id=" + id + ", name=" + name + ", address=" + address + "]";
	}



	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public static class InnerBuilder {

		private int id;
		private String name;
		private String address;

		public InnerBuilder() {

		}

		public InnerBuilder setId(int id) {
			this.id = id;
			return this;
		}

		public InnerBuilder setName(String name) {
			this.name = name;
			return this;
		}

		public InnerBuilder setAddress(String address) {
			this.address = address;
			return this;
		}

		public BuilderDesignPattern build() {

			BuilderDesignPattern builder = new BuilderDesignPattern(this);
			return builder;
		}

	}

}
