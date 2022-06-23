# Write your MySQL query statement below
select email as Email
from person
group by 1
having count(1) > 1;