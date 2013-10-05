create view Innsats as
	select anr, sum(timer) as timer
	from Prosjekt
	group by anr;

create view Bonus (anr, bonusbelop) as
	(select anr, 3000
	from Innsats
	where timer >= 50)
union
	(select anr, 1500
	from Innsats
	where timer >= 15 and timer < 50);
