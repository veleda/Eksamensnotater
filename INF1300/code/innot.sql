select	navn
from	Ansatt
where	anr not in (select	anr
	   	    from	Prosjekt);
