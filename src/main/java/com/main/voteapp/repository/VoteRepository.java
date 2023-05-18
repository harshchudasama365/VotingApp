package com.main.voteapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.main.voteapp.model.Vote;

@Repository
public interface VoteRepository extends JpaRepository<Vote, String>{
	
	@Transactional
	@Modifying
	@Query("update Vote v set v.voteCount = v.voteCount + 1 where v.candidateName = ?1")
	void updateVoteCount(String candidateName);
	
}
