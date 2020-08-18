package epl.epl.matches.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import epl.epl.matches.Model.Players;

@Service
public class PlayerService {
	
	List<Players> playerobj = new ArrayList<>();

	public List<Players> getplayers(){
		return playerobj;
	}
	
	public void addplayers(Players players) {
		playerobj.add(players);
	}
}
