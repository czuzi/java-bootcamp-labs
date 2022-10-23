package enumtype.firstenum;

import java.util.Arrays;

public class FirstEnumMain {
	public static void main(String[] args) {
		System.out.println(Continent.EUROPE);
		System.out.println(Continent.AFRICA);
		System.out.println(Continent.ASIA);
		System.out.println(Continent.ANTARCTICA);
		System.out.println(Continent.NORTHAMERICA);
		System.out.println(Continent.SOUTHAMERICA);
		System.out.println(Continent.AUSTRALIA);
		System.out.println(Arrays.toString(Continent.values()));
		System.out.println(Ocean.valueOf("ATLANTIC"));
		System.out.println(Ocean.valueOf("PACIFIC"));
		System.out.println(Ocean.valueOf("INDIAN"));
		System.out.println(Ocean.valueOf("ARCTIC"));
		System.out.println(Football.GOALKEEPER.name());
		System.out.println(Football.DEFENDER.name());
		System.out.println(Football.MIDFIELDER.name());
		System.out.println(Football.FORWARD.name());
		System.out.println(University.DE.getName());
		System.out.println(SolarSystem.JUPITER.getMoons());
		System.out.println(Position.CEO.getSalary());
		System.out.println(Position.CEO.getBenefit());
		System.out.println(Position.JUNIOR.getSalary());
		System.out.println(Position.JUNIOR.getBenefit());
	}
}
