select count(*)
from ansatt 
where avd = 'ifi' and
	lonn > ( select 2 * avg(lonn)
		from ansatt
		where avd = 'adm' );
