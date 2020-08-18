package epl.epl.matches.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


import epl.epl.matches.Model.TeamObj;

@Service
public class TeamService {
	
	List<TeamObj> obj = new ArrayList<>();
	
	public List<TeamObj> getAllTeams(){
		return obj;
	}
	

	public void addTeam(TeamObj teamobj) {
		obj.add(teamobj);
	}


	}

