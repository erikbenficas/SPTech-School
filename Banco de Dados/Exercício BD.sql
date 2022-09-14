use sprint2;

create table professor ( idProfessor int primary key auto_increment,
nome varchar(50), 
sobrenome varchar(30),
especialidade1 varchar(40),
especialidade2 varchar(40)
);

insert into professor (nome, sobrenome, especialidade1, especialidade2) values
('Sérgio', 'Silva', 'matemática', 'engenharia'),
('Paulo', 'Oliveira', 'banco de dados', 'back-end'),
('Adalto', 'Lima', 'TI', 'BI'),
('Ellen', 'Moraes', 'matemática', 'cálculo'),
('Vivi', 'Souza', 'banco de dados', 'back-end'),
('Monica', 'Herreira', 'TI', 'BI');


create table disciplina (idDisc int primary key auto_increment,
nomeDisc varchar(45)
);

insert into disciplina (nomeDisc) values
('banco de dados'),
('TI'),
('matemática'),
('back-end');

alter table disciplina add column fkProfessor int;

alter table disciplina add foreign key (fkProfessor)
references professor(idProfessor);

select * from disciplina;

update disciplina set fkProfessor = 1 where idDisc = 3;
update disciplina set fkProfessor = 6 where idDisc = 2;
update disciplina set fkProfessor = 2 where idDisc = 1;
update disciplina set fkProfessor = 5 where idDisc = 4;

select * from disciplina join professor
on idProfessor = fkProfessor;

select nome, nomeDisc, idProfessor from disciplina join professor
on idProfessor = fkProfessor;

select * from disciplina join professor
on idProfessor = fkProfessor
where sobrenome = 'Souza';

select especialidade1, nomeDisc from disciplina join professor
on idProfessor = fkProfessor
where nome = 'Monica'
order by especialidade1 asc;


