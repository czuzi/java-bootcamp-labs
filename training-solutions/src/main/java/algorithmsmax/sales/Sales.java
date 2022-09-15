package algorithmsmax.sales;

import java.util.List;

public class Sales {


	public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> salespersons) {
		Salesperson res = null;
		for (Salesperson current : salespersons) {
			if (res == null || current.getAmount() > res.getAmount()) {
				res = current;
			}
		}
		return res;
	}

	public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> salespersons) {
		Salesperson res = null;
		for (Salesperson current : salespersons) {
			if (res == null || current.getDifferenceFromTarget() > res.getDifferenceFromTarget()) {
				res = current;
			}
		}
		return res;
	}

	public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> salespersons) {
		Salesperson res = null;
		for (Salesperson current : salespersons) {
			if (res == null || current.getDifferenceFromTarget() < res.getDifferenceFromTarget()) {
				res = current;
			}
		}
		return res;
	}
}
