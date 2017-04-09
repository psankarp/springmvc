package com.example.ioc;

public class Target {

	public Target() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Target(Sample sample1) {
		super();
		this.sample1 = sample1;
		
	}
	
	public Target(Sample sample1, Sample sample2, Example example) {
		super();
		this.sample1 = sample1;
		this.sample2 = sample2;
		this.example = example;
	}

	private Sample sample1;
	private Sample sample2;
	private Example example;

	public Sample getSample1() {
		return sample1;
	}

	public void setSample1(Sample sample1) {
		this.sample1 = sample1;
	}

	public Sample getSample2() {
		return sample2;
	}

	public void setSample2(Sample sample2) {
		this.sample2 = sample2;
	}

	public Example getExample() {
		return example;
	}

	public void setExample(Example example) {
		this.example = example;
	}

	@Override
	public String toString() {
		return "Target [sample1=" + sample1 + ", sample2=" + sample2 + ", example=" + example + "]";
	}

}
