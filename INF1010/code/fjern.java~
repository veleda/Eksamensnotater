public boolean leggTil (String navn, String nummer) {
	if (hentObjekt(navn) == null) {
		E tmp = new E(navn, nummer);
		tmp.neste = root;
		root = tmp;
		return true;
	}
	return false;
}
