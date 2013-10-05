select	count(*)
from	Ansatt
where	avd = 'ifi' and
	lonn > all (select 	lonn
		    from 	Ansatt
		    where	avd = 'kjemi');
