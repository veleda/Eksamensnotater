select		Pnavn, StartDato
from 		Kunde k, Prosjekt p
where		Knavn = 'Pust og pes AS' and k.KId = p.KId
order by	StartDato desc;
