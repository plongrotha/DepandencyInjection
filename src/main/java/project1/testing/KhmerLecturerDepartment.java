package project1.testing;

import org.springframework.stereotype.Component;

@Component
public class KhmerLecturerDepartment implements RoyalUniversityOfPhnomPenh {

	@Override
	public String payment() {
		return "Khmer we pay 350$ per year";
	}
}
