package com.poi;

import java.io.IOException;

public class TestCases {


	Lib_BusinessP bp = new Lib_BusinessP();
	
	public void testlogin() throws InterruptedException, IOException {
		bp.Login("admin", "pwd");
		
	}
	public void testSearch() throws InterruptedException {
		bp.Search("chandigarh","Domino's");
	}

}
