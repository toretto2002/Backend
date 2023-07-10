CREATE TABLE clienti (
	
	numeroCliente SERIAL PRIMARY KEY,
	nome VARCHAR NOT NULL DEFAULT '---',
	cognome VARCHAR NOT NULL DEFAULT '---',
	dataNascita DATE NOT NULL DEFAULT CURRENT_DATE,
	regioneResidenza VARCHAR NOT NULL
	
);

CREATE TABLE fornitori (

	numeroFornitore SERIAL,
	denominazione VARCHAR NOT NULL,
	regioneResidenza VARCHAR NOT NULL
	CONSTRAINT numeroFornitore_PK PRIMARY KEY (numeroFornitore)
);

CREATE TABLE fatture (
	
	numeroFattura SERIAL,
	tipologia VARCHAR NOT NULL,
	importo INTEGER NOT NULL,
	iva FLOAT NOT NULL,
	idCliente INTEGER NOT NULL,
	dataFattura DATE NOT NULL DEFAULT CURRENT_DATE,
	numeroFornitore INTEGER NOT NULL,
	CONSTRAINT numeroFattura_PK PRIMARY KEY (numeroFattura),
	CONSTRAINT idCliente_FK FOREIGN KEY (idCliente) REFERENCES clienti (numeroCliente),
	CONSTRAINT numeroFornitore_FK FOREIGN KEY (numeroFornitore) REFERENCES fornitori (numeroFornitore)
);

CREATE TABLE prodotti (

	idProdotto SERIAL,
	descrizione VARCHAR NOT NULL,
	inProduzione BOOLEAN NOT NULL,
	inCommercio BOOLEAN NOT NULL,
	dataAttivazionr DATE NOT NULL,
	dataDisattivazione DATE NOT NULL
);



INSERT INTO clienti (nome, cognome, dataNascita, regioneResidenza) VALUES ('Mario', 'Rossi', '1945-02-13', 'Sicilia');
INSERT INTO clienti (nome, cognome, dataNascita, regioneResidenza) VALUES ('Mariuccia', 'Felice', '1982-08-19', 'Sicilia');
INSERT INTO clienti (nome, cognome, dataNascita, regioneResidenza) VALUES ('Filippo', 'Ranocchia', '2006-11-04', 'Sicilia');

SELECT nome, cognome FROM clienti WHERE DATE_PART('year', clienti.dataNascita) = '1982';

INSERT INTO fatture (tipologia, importo, iva, idCliente, dataFattura, numeroFornitore) VALUES ('elettronica', 89.9, 0.2, 2, '2020-01-04', 1);
INSERT INTO fatture (tipologia, importo, iva, idCliente, dataFattura, numeroFornitore) VALUES ('fisica', 102.9, 0.22, 1, '2022-07-04', 1);
INSERT INTO fatture (tipologia, importo, iva, idCliente, dataFattura, numeroFornitore) VALUES ('elettronica', 189, 0.05, 3, '2021-07-04', 2);
INSERT INTO fatture (tipologia, importo, iva, idCliente, dataFattura, numeroFornitore) VALUES ('fisica', 15.4, 0.2, 1, '2022-07-04', 3);

INSERT INTO fornitori (denominazione, regioneResidenza) VALUES ('dottore', 'Lombardia');
INSERT INTO fornitori (denominazione, regioneResidenza) VALUES ('francia', 'Campania');
INSERT INTO fornitori (denominazione, regioneResidenza) VALUES ('avvocato', 'Campania');


SELECT * FROM fatture WHERE iva = 0.2;

