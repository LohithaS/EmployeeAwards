package com;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

public class Election {

	public List<Voters> voter;
	public String party;

	// public List<String> listOfvoters;

	public int votesCalculation(List<Voters> voter) {
		int totalVotes;

		List<String> YCP = new ArrayList<>();
		List<String> TDP = new ArrayList<>();
		List<String> JSP = new ArrayList<>();
		for (Voters s : voter) {
			if (s.age >= 18 && s.name != null) {
				if (s.partyName.equalsIgnoreCase("YCP")) {
					YCP.add(s.name);

				} else if (s.partyName.equalsIgnoreCase("TDP")) {
					TDP.add(s.name);

				} else if (s.partyName.equalsIgnoreCase("JSP")) {
					JSP.add(s.name);

				}
			}
		}

		if (YCP.size() > TDP.size() || YCP.size() > JSP.size()) {
			totalVotes = YCP.size();
			party = "YCP";
		} else if (TDP.size() > JSP.size()) {
			totalVotes = TDP.size();
			party = "TDP";
		} else {
			totalVotes = JSP.size();
			party = "JSP";
		}

		return totalVotes;
	}

}
