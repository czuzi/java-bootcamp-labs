package day03;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class FrontOfStageTicket extends Ticket{

	private String code;

	public FrontOfStageTicket(String bandName, LocalDateTime date, int price, String code) {
		super(bandName, date, Math.round(price * 1.3f));
		this.code = code;
	}

	@Override
	public LocalTime entry() {
		return super.entry().minusHours(1);
	}

	public String getCode() {
		return code;
	}
}
