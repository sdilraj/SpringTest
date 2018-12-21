package com.spring;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is a cold day";
	}

}
