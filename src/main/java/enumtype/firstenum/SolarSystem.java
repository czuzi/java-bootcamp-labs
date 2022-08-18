package enumtype.firstenum;

public enum SolarSystem {
	JUPITER(79), EARTH(1);

	private final int moons;

	SolarSystem(int moons) {
		this.moons = moons;
	}

	public int getMoons() {
		return moons;
	}
}
