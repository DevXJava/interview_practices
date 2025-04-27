package com.browser.search;

import java.awt.Desktop;
import java.net.URI;

public class SearchPoint {
    
	public static void main(String[] args) throws Exception {
		Desktop desk = Desktop.getDesktop();
		
		//https://www.bing.com/search?pglt=41&q=hi&cvid=df87d40bcc834f0fab31ac38ca43adab&aqs=edge..69i57j0l4j46j0l3.2350j0j1&FORM=ANNTA1&PC=U531
        for (int i = 0; i <= 90; i++) {
        	desk.browse(new URI("https://www.bing.com/search?pglt=41&q="+i+"&cvid=df87d40bcc834f0fab31ac38ca43adab&aqs=edge..69i57j0l4j46j0l3.2350j0j1&FORM=ANNTA1&PC=U531"));
		}
		
	}

}
