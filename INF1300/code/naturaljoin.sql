select f.title
from film f
natural join filparticipation fp
natural join person p
where p.firstname = 'Francis Ford' and p.lastname = 'Coppola' and fp.parttype = 'director';
