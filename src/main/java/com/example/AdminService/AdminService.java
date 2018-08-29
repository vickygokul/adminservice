package com.example.AdminService;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

	@Autowired
	private AdminRepo repo;

	@Autowired
	private MatchRepo mrepo;

	private static AtomicInteger counter = new AtomicInteger();

	public static int nextValue() {
		return counter.getAndIncrement();
	}



	public Match create(int id, String date, String timing, String stadium,String teamAName, String teamBName) {
		id = nextValue()+1;
		return mrepo.save(new Match(id,date, timing, stadium,teamAName,teamBName));
	}

	public List<Match> getAll(){
		return mrepo.findAll();

	}



	public Match update(int id,String date, String timing, String stadium,String teamAName, String teamBName) {
		Match p=mrepo.findByid(id);



		p.setDate(date);
		p.setTiming(timing);
		p.setStadium(stadium);

		p.setTeamAName(teamAName);
		p.setTeamBName(teamBName);
		return mrepo.save(p);

	}

	public void delete(int id) {
		Match p= mrepo.findByid(id);
		mrepo.delete(p);



	}
}
