package org.jerson.trial.services;

public class TutorialFinderService {
	
	public String getBestTutorialSite(String site) {
		
		if(site.equals("mine")) {
			return "ajbazaar.com";
		} else {
			return "I don't know!!!";
		}
	}

}
