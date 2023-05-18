package com.main.voteapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vote {
	
	@Override
	public String toString() {
		return "Vote [candidateName=" + candidateName + ", voteCount=" + voteCount + "]";
	}
	@Id
	private String candidateName;
	private int voteCount;
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public int getVoteCount() {
		return voteCount;
	}
	public void setVoteCount(int voteCount) {
		this.voteCount = voteCount;
	}

}
