package com.psja.facade;

import com.psja.model.BROWSER_NAME;
import com.psja.model.REPORT_Enum;

public class FacadeClient {

	public static void clientOperation() {
		FacadeDesign facadeDesign = new FacadeDesign();
		facadeDesign.facadeWork(BROWSER_NAME.OPERA, REPORT_Enum.JUNIT);
	}
	
}
