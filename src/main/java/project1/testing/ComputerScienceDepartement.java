package project1.testing;

import org.springframework.stereotype.Component;

@Component
public class ComputerScienceDepartement implements RoyalUniversityOfPhnomPenh {

	@Override
	public String payment() {
		return "Computer Science we pay 500$ per years";
	}
}
