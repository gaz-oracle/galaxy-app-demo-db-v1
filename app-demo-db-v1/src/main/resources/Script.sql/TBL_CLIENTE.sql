USE SpringGalaxy1;

CREATE TABLE TBL_CLIENTE(
	CLIENTE_ID INT auto_increment PRIMARY KEY,
	RAZONSOCIAL VARCHAR(100) NOT NULL unique,
	RFC CHAR(6));
    
DROP TABLE  TBL_CLIENTE;

insert into TBL_CLIENTE(RAZONSOCIAL,RFC)
VALUES('TEL-CON', 'TELCOM');

insert into TBL_CLIENTE(RAZONSOCIAL,RFC)
VALUES('TELNETdupl', 'NET678');

insert into TBL_CLIENTE(RAZONSOCIAL,RFC)
VALUES('MEGAOPT', 'OPT785');

insert into TBL_CLIENTE(RAZONSOCIAL,RFC)
VALUES('ZTVTG', 'VTZ555');

select * from TBL_CLIENTE;