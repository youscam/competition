package ma.youscam.competition.model;

import java.util.Comparator;

public class SecoreComparedByTiming implements Comparator<Secore> {

	@Override
	public int compare(Secore o1, Secore o2) {
		return o1.getTiming().compareTo(o2.getTiming());
	}

}
