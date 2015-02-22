DROP TABLE test; 

CREATE TABLE test (

	id serial,
	catchphrase varchar(255) not null,
	create_date timestamp default now()

);

insert into test (catchphrase) values ('I never let being smart stop me from doing stupid things.');

SELECT * FROM test;
