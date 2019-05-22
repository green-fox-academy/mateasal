show databases;

use todo;

create table mytable (
id int unsigned not null auto_increment primary key,
task varchar(50) not null,
status varchar(10) not null
);

