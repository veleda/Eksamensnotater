void settInnSist (E e) {
	if (liste == null)
		liste = e;
	else {
		E tmp = liste;
		while (tmp.neste != null) {
			tmp = tmp.neste;
			tmp.neste = e;
		}
	}
}
