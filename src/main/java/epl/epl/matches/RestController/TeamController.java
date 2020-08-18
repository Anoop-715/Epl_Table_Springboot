package epl.epl.matches.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import epl.epl.matches.Model.Epl;
import epl.epl.matches.Model.TeamObj;
import epl.epl.matches.Service.TeamService;

@RestController
public class TeamController {
	
	@Autowired
	private TeamService teamservice;

//	@GetMapping("/greeting")
//	@ResponseBody public String greeting() {
//		return"{'hello':'world'}";
//		}


//	@GetMapping( value ="/greeting")
//	public  Map<String, String>  greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
//		HashMap<String, String> map = new HashMap<>();
//	    map.put("Hello", name);
//	    return map;
//	}
//	
//	@GetMapping( value ="/greeting/{name}")
//	public String greeting(@PathVariable String name) {
//		return String.format("Hello " + name);
//	}
	
	@GetMapping( value ="/greeting/{name}")
	public Epl greeting(@PathVariable String name) {
		Epl obj = new Epl(name);
	return obj;
	}
	
	
	
//	@GetMapping("/greeting")
//	public Epl greeting(@RequestParam(value = "name", required = false, defaultValue = "haii") String name) {
//		Epl obj = new Epl(name);
//		return obj;
//	} 

//	@RequestMapping(method=RequestMethod.POST,value="/greeting/add" )
//	public TeamObj addTopic(@RequestBody TeamObj teamobj) {
//		return  new TeamObj(teamobj.getTeamname(),teamobj.getPoints(),teamobj.getWin(),teamobj.getLoss(),teamobj.getTotalgame());
//		}
	
//	@RequestMapping(method=RequestMethod.POST,value="/greeting/add" )
//	public String addTopic(@RequestBody TeamObj teamobj) {
//	            System.out.println(teamobj.toString());
//	            return "success";
//		}
//	
	@RequestMapping(method=RequestMethod.POST,value="/greeting/add" )
	public void addTopic(@RequestBody TeamObj teamobj) { 	
		   teamservice.addTeam(teamobj);	   
		   System.out.println(teamobj.toString());
		}
	
	@RequestMapping("/greeting/add/teamobj")
	public List<TeamObj> teamView() {
             return teamservice.getAllTeams();
	}

		
}

	
