package algorithmstransformation.family;

import java.util.ArrayList;
import java.util.List;

public class Family {

	private List<FamilyMember> familyMembers;

	public Family() {
		this.familyMembers = new ArrayList<>();
	}

	public List<FamilyMember> getFamilyMembers() {
		return familyMembers;
	}

	public void addFamilyMember(FamilyMember familyMember) {
		familyMembers.add(familyMember);
	}

	public List<Integer> getAgesOfFamilyMembersWithNameGiven(String name) {
		List<Integer> res = new ArrayList<>();
		for (FamilyMember familyMember: familyMembers) {
			if (familyMember.getName().contains(name)) {
				res.add(familyMember.getAge());
			}
		}
		return res;
	}
}
