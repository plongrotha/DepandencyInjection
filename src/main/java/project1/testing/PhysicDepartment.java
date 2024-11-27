package project1.testing;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PhysicDepartment implements RoyalUniversityOfPhnomPenh {

	@Override
	public String payment() {
		return "this is department pay as like Computer Science Department too is 500$";
	}
}
