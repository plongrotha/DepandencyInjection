package project1.testing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UniversityServiceSupport {

	
	// about dependency we can use with constructor, setter, and field
//	@Autowired
	                //ComputerScienceDepartement
//	@Resource(name = "computerScienceDepartement")
	private RoyalUniversityOfPhnomPenh royalUniversityOfPhnomPenh;

//	@Autowired
	// version 4 up we can use without @Autowired
	/*public UniversityServiceSupport(RoyalUniversityOfPhnomPenh ofPhnomPenh) {
		this.royalUniversityOfPhnomPenh = ofPhnomPenh;
	}
	*/
	
	@Autowired
	public void SetUniversityServiceAndSupport(RoyalUniversityOfPhnomPenh royalUniversityOfPhnomPenh) {
		this.royalUniversityOfPhnomPenh = royalUniversityOfPhnomPenh;
	}

	public void getinformationAboutPayment() {
		System.out.println(royalUniversityOfPhnomPenh.payment());
	}
}
