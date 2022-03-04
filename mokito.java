package com.myWebApp.firstSpringProject;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class) // mokito with junit5
class TestSomeBusiness {
	@Mock
	DataService ds;
	@InjectMocks
	SomeBusinessImpl sbi;
	
	@Test
	void test() {
		when(ds.getdata()).thenReturn(new int [] {121,21,5,5,54,54,54});
		assertEquals(121,sbi.findMax());
		
	}

}

