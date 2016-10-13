package org.jerson.trial.actions;

import org.jerson.trial.services.TutorialFinderService;

public class TutorialAction {
	
	private String bestSite;
	
	private String site = "mine";
	
	public String execute() {
		
		
		TutorialFinderService tfs = new TutorialFinderService();
		
		setBestSite(tfs.getBestTutorialSite(getSite()));
		
		return "success";
		
	}

	public String getBestSite() {
		return bestSite;
	}

	public void setBestSite(String bestSite) {
		this.bestSite = bestSite;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

}
