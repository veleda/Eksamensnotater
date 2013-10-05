Ansatt(Aid, Navn, Tittel, Fdato, Pnr, AnsDato)

create table Ansatt (
	Aid	int primary key, 
	Navn	varchar(40) not null,
	Tittel	varchar(15) not null,
	Fdato	char(6) not null, 
	Pnr	char(5) not null,
	AnsDato	date,
unique (Fdato, Pnr)
);
