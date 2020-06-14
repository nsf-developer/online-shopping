CREATE TABLE category (

	id IDENTITY,
	name VARCHAR(50),
	description VARCHAR(255),
	image_url VARCHAR(50),
	is_active BOOLEAN,
	
	CONSTRAINT pk_category_id PRIMARY KEY (id)

);

INSERT INTO category (name, description, image_url,is_active) VALUES ('Creams', 'This is description for Creams category', 'CAT_3.PNG', true);
INSERT INTO category (name, description, image_url,is_active) VALUES ('Perfumes', 'This is description for Perfumes category', 'CAT_3.PNG', true);
INSERT INTO category (name, description, image_url,is_active) VALUES ('Lipsticks', 'This is description for Lipsticks category', 'CAT_3.PNG', true);

CREATE TABLE user_details (

	id IDENTITY,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	role VARCHAR(50),
	enabled BOOLEAN,
	password VARCHAR(50),
	email VARCHAR(100),
	contact_number VARCHAR(15),
	CONSTRAINT pk_user_id PRIMARY KEY(id)

);

INSERT INTO user_details
(first_name, last_name, role, enabled, password, email, contact_number) 
VALUES ('MHD', 'NAseef', 'ADMIN', true, '12345', 'nsf@gmail.com', '0777777777');

INSERT INTO user_details
(first_name, last_name, role, enabled, password, email, contact_number) 
VALUES ('Ravindra', 'Jadeja', 'SUPPLIER', true, '12345', 'rj@gmail.com', '0778888888');

INSERT INTO user_details
(first_name, last_name, role, enabled, password, email, contact_number) 
VALUES ('Ravichandra', 'Ashwin', 'SUPPLIER', true, '12345', 'ra@gmail.com', '0779999999');


CREATE TABLE product (

	id IDENTITY,
	code VARCHAR(20),
	name VARCHAR(50),
	brand VARCHAR(50),
	description VARCHAR(255),
	unit_price DECIMAL(10,2),
	quantity INT,
	is_active BOOLEAN,
	category_id INT,
	supplier_id INT,
	purchases INT DEFAULT 0,
	views INT DEFAULT 0,
	CONSTRAINT pk_product_id PRIMARY KEY (id),
	CONSTRAINT fk_product_category_id FOREIGN KEY (category_id) REFERENCES category (id),
	CONSTRAINT fk_product_supplier_id FOREIGN KEY (supplier_id) REFERENCES user_details(id)
	
);

INSERT INTO product
(code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id)
VALUES ('PRDABC123DEFX', 'Milk and Honey', 'oriflame', 'Desicription about Milk and Honey product', 1850, 5, true, 1,2);

INSERT INTO product
(code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id)
VALUES ('PRDDEF123DEFX', 'Lip Bam', 'oriflame', 'Desicription about Lip Bam product', 780, 5, true, 1,2);

INSERT INTO product
(code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id)
VALUES ('PRDHIJ123DEFX', 'Body Spray', 'oriflame', 'Desicription about Body Spray product', 2500, 5, true, 2,2);

INSERT INTO product
(code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id)
VALUES ('PRDLMN123DEFX', 'Lipstick Red', 'oriflame', 'Desicription about Lipstick Red product', 680, 5, true, 3,2);

INSERT INTO product
(code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id)
VALUES ('PRDOPQ123DEFX', 'Face Wash', 'oriflame', 'Desicription about Face Wash product', 920, 5, true, 1,2);



