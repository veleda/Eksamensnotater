create table Ansatt (
	...
	Tittel varchar(15)
	check (Tittel='Selger' or Tittel='Direktor' or ...),
	...);
