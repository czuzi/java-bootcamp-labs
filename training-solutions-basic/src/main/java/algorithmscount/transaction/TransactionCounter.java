package algorithmscount.transaction;

import java.util.List;

public class TransactionCounter {
	public int countEntryLessThan(List<Transaction> transactions, int minAmount) {
		int count = 0;
		for (Transaction transaction : transactions) {
			if (transaction.isCredit() && transaction.getAmount() < minAmount) {
				count++;
			}
		}
		return count;
	}
}
