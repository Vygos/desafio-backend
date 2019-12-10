INSERT INTO permissao values(1,'ADMIN');
INSERT INTO permissao values(2,'COMUM');

insert into usuario (id,nome, password, id_permissao) values(1,'admin', '123456',1);
insert into usuario (id,nome, password, id_permissao) values(2,'comum', '123456',2);

insert into tipo_telefone(id, ds_tipo_telefone) values (1, 'comercial');
insert into tipo_telefone(id, ds_tipo_telefone) values (2, 'residencial');
insert into tipo_telefone(id, ds_tipo_telefone) values (3, 'telefone');
