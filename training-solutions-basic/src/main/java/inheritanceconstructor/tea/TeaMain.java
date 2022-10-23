package inheritanceconstructor.tea;

public class TeaMain {

	public static void main(String[] args) {
		Tea tea = new Tea("Mate", 1299);
		HerbalTea herbalTea = new HerbalTea("Herbal green", 1699);
		System.out.println(tea.getName() + " " + tea.getPrice());
		System.out.println(herbalTea.getName() + " " + herbalTea.getPrice());
	}
}
