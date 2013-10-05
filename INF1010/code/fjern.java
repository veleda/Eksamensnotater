public boolean fjern (String navn) {
	E tmp = root;
	
	if (tmp == null) return false;

	if ( root.navn.equals(navn) ) {
		root = root.neste;
		return true;
	}

	while (tmp.neste != null) {
		if ( tmp.neste.navn.equals(navn) ) {
			tmp.neste = tmp.neste.neste;
			return true;
		}
		tmp = tmp.neste;
	}
	return false;
}
