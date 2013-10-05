select avdnavn, count(*), avg(lonn)
from ansatt, avdeling
where avd = avdnavn
group by avdnavn;
