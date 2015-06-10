package com.selesy.fuzzunit.examples;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.selesy.fuzzunit.annotations.Iterate;
import com.selesy.fuzzunit.runners.FuzzUnitRunner;

@RunWith(FuzzUnitRunner.class)
public class IterateExampleTest {
	
	static final Logger LOGGER = LoggerFactory.getLogger(IterateExampleTest.class);
	
	@Iterate({
		"alpha",
		"beta",
		"gamma"
	})
	String greek;
	
	@Iterate({
		"1",
		"10",
		"100",
		"1000"
	})
	int decade;
	
	@Test
	public void test() {
		LOGGER.trace("test()");
	}

}
