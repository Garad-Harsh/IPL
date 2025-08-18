package service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Supplier;

import entity.Team;
import repository.TeamRepository;

public class TeamService {

	public void selectOptions() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to IPL portal ");
		System.out.println("Please select following options - ");
		System.out.println("1. Get All Team Details");
		System.out.println("2. Get team details by short name");
		System.out.println("3. Get team details by ID");

		int input = sc.nextInt();
		System.err.println("You have selected option : " + input);

		switch (input) {
		// get All team details
		case 1: {
			System.out.println(TeamRepository.getCSKTeamDetails());
			System.out.println(TeamRepository.getMITeamDetails());
			System.out.println(TeamRepository.getGTTeamDetails());
			System.out.println(TeamRepository.getLSGTeamDetails());
			System.out.println(TeamRepository.getPBSKTeamDetails());
			System.out.println(TeamRepository.getSRHTeamDetails());
			System.out.println(TeamRepository.getKKRTeamDetails());
			System.out.println(TeamRepository.getRCBTeamDetails());
			System.out.println(TeamRepository.getRRTeamDetails());
			System.out.println(TeamRepository.getDCTeamDetails());
			// call all remaining 8 team methods here

			break;
		}
		// get team details by short Name
		case 2: {
			System.out.println("Please enter your fav team's short name : ");
			String teamShortName = sc.next();
			System.err.println("entered team short name is  : " + teamShortName);
			getTeamByShortName(teamShortName);
			break;
		}
		// get team details by Id
		case 3: {
			System.out.println("Please enter your fav team's id : ");
			int teamSetId = sc.nextInt();
			System.err.println("entered team Id is  : " + teamSetId);
			getTeamById(teamSetId);
			break;
			// for get team details by ID
			// further logic should not have switch case
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + input);
		}
	}

	private void getTeamByShortName(String shortName) {
		// here we will write a code logic to get team details by short name
		switch (shortName) {
		case "CSK": {
			System.out.println(TeamRepository.getCSKTeamDetails());
			break;
		}
		case "MI": {
			System.out.println(TeamRepository.getMITeamDetails());
			break;
		}
		case "GT": {
			System.out.println(TeamRepository.getGTTeamDetails());
			break;
		}
		case "LSG": {
			System.out.println(TeamRepository.getLSGTeamDetails());
			break;
		}
		case "PBSK": {
			System.out.println(TeamRepository.getPBSKTeamDetails());
			break;
		}
		case "SRH": {
			System.out.println(TeamRepository.getSRHTeamDetails());
			break;
		}
		case "KKR": {
			System.out.println(TeamRepository.getKKRTeamDetails());
			break;
		}
		case "RCB": {
			System.out.println(TeamRepository.getRCBTeamDetails());
			break;
		}
		case "RR": {
			System.out.println(TeamRepository.getRRTeamDetails());
			break;
		}
		case "DC": {
			System.out.println(TeamRepository.getDCTeamDetails());
			break;
		}
		// add remaining teams cases here.
		default:
			throw new IllegalArgumentException("Unexpected value: " + shortName);
		}
	}

	private void getTeamById(int teamId) {
		// here we will write a code logic to get team details by Id
		if (teamId == 1)
			System.out.println(TeamRepository.getMITeamDetails());
		else if (teamId == 2)
			System.out.println(TeamRepository.getCSKTeamDetails());
		else if (teamId == 3)
			System.out.println(TeamRepository.getGTTeamDetails());
		else if (teamId == 4)
			System.out.println(TeamRepository.getLSGTeamDetails());
		else if (teamId == 5)
			System.out.println(TeamRepository.getPBSKTeamDetails());
		else if (teamId == 6)
			System.out.println(TeamRepository.getSRHTeamDetails());
		else if (teamId == 7)
			System.out.println(TeamRepository.getKKRTeamDetails());
		else if (teamId == 8)
			System.out.println(TeamRepository.getRCBTeamDetails());
		else if (teamId == 9)
			System.out.println(TeamRepository.getRRTeamDetails());
		else if (teamId == 10)
			System.out.println(TeamRepository.getDCTeamDetails());
		else
			System.err.println("Invalid team ID entered!");
//			Map<Integer, Supplier<Team>> teamMap = new HashMap<>();
//		    teamMap.put(1, TeamRepository::getMITeamDetails);
//		    teamMap.put(2, TeamRepository::getCSKTeamDetails);
//		    teamMap.put(3, TeamRepository::getGTTeamDetails);
//		    teamMap.put(4, TeamRepository::getLSGTeamDetails);
//		    teamMap.put(5, TeamRepository::getPBSKTeamDetails);
//		    teamMap.put(6, TeamRepository::getSRHTeamDetails);
//		    teamMap.put(7, TeamRepository::getKKRTeamDetails);
//		    teamMap.put(8, TeamRepository::getRCBTeamDetails);
//		    teamMap.put(9, TeamRepository::getRRTeamDetails);
//		    teamMap.put(10, TeamRepository::getDCTeamDetails);
//
//		    // Get the team details from the map
//		    Supplier<Team> teamSupplier = teamMap.get(teamId);
//
//		    if (teamSupplier != null) {
//		        System.out.println(teamSupplier.get());
//		    } else {
//		        System.err.println("Invalid team ID entered!");
//		    }

	}

}
