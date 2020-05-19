DROP TABLE IF EXISTS swim_event;

CREATE TABLE swim_event (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  priceBRL DECIMAL(20,2) NOT NULL
);

INSERT INTO swim_event (id, name, priceBRL) VALUES (999, 'English Channel', 14000.20);

