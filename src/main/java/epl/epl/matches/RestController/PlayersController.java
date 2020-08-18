package epl.epl.matches.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import epl.epl.matches.Model.Players;
import epl.epl.matches.Service.PlayerService;

@RestController
public class PlayersController {
	
	@Autowired
	private PlayerService playerservice;
	
	@RequestMapping(method=RequestMethod.GET,value="/greeting/add/teamobj/heloo")
	public List<Players> getplayers() {
		return playerservice.getplayers();
	}

	@RequestMapping(method=RequestMethod.POST,value="/greeting/add/teamobj/heloo/playerrating" )
	public String addPlayers(@RequestBody Players players)
	{
	playerservice.addplayers(players);
	return "Success players";
	}
	
}
