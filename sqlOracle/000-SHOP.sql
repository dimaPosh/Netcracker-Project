CREATE TABLE USERS
(
USER_ID  NUMBER(6) NOT NULL,
LOGIN VARCHAR2(25) NOT NULL,
PASSWORD CHAR(144) NOT NULL,
FIRST_NAME VARCHAR2(25) NOT NULL,
LAST_NAME VARCHAR2(25) NOT NULL,
EMAIL VARCHAR2(40) NOT NULL,
PHONE_NUMBER VARCHAR2(25) NOT NULL,
ADDRESS_ID NUMBER(6),
CART_ID  NUMBER(6)
);

CREATE TABLE CARTS
(
CART_ID  NUMBER(6) NOT NULL,
CART_DETAILS_ID NUMBER(6) NOT NULL
);

CREATE TABLE CATEGORIES
(
CATEGORY_ID  NUMBER(6) NOT NULL,
NAME VARCHAR2(30) NOT NULL
);


CREATE TABLE PRODUCTS(
PRODUCT_ID  NUMBER(6) NOT NULL,
NAME VARCHAR2(30) NOT NULL,
PRICE NUMBER(10,2) NOT NULL,
DESCRIPTION VARCHAR2(255),
IMAGE BLOB,
COUNT NUMBER NOT NULL,
CATEGORY_ID NUMBER(6) NOT NULL
);

CREATE TABLE ADDRESSES(
ADDRESS_ID NUMBER(6) NOT NULL,
APARTMENT VARCHAR2(10) NOT NULL,
HOME VARCHAR2(10) NOT NULL,
STREET VARCHAR2(50) NOT NULL,
CITY VARCHAR2(50) NOT NULL,
COUNTRY VARCHAR2(50) NOT NULL,
);

CREATE TABLE CART_DETAILS(
CART_DETAILS_ID NUMBER(6) NOT NULL,
CART_ID  NUMBER(6) NOT NULL,
PRODUCT_ID NUMBER(6) NOT NULL
);
ALTER TABLE USERS ADD CONSTRAINT USER_ID_PK PRIMARY KEY (USER_ID);
ALTER TABLE PRODUCTS ADD CONSTRAINT PRODUCT_ID_PK PRIMARY KEY (PRODUCT_ID);
ALTER TABLE CATEGORIES ADD CONSTRAINT CATEGORY_ID_PK PRIMARY KEY (CATEGORY_ID);
ALTER TABLE CARTS ADD CONSTRAINT CART_ID_PK PRIMARY KEY (CART_ID);
ALTER TABLE CART_DETAILS ADD CONSTRAINT CA_DET_ID_PK PRIMARY KEY (CART_DETAILS_ID);
ALTER TABLE ADDRESSES ADD CONSTRAINT ADDRESS_ID_PK PRIMARY KEY (ADDRESS_ID);

ALTER TABLE USERS ADD CONSTRAINT US_AD_FK FOREIGN KEY (ADDRESS_ID)
REFERENCES ADDRESSES (ADDRESS_ID);

ALTER TABLE USERS ADD CONSTRAINT US_C_ID_FK FOREIGN KEY (CART_ID)
REFERENCES CARTS (CART_ID);

ALTER TABLE CARTS ADD CONSTRAINT CA_DET_ID_FK FOREIGN KEY (CART_DETAILS_ID)
REFERENCES CART_DETAILS (CART_DETAILS_ID);

ALTER TABLE CART_DETAILS ADD CONSTRAINT PROD_ID_FK FOREIGN KEY (PRODUCT_ID)
REFERENCES PRODUCTS (PRODUCT_ID);

ALTER TABLE CART_DETAILS ADD CONSTRAINT CA_ID_FK FOREIGN KEY (CART_ID)
REFERENCES CARTS (CART_ID);

ALTER TABLE PRODUCTS ADD CONSTRAINT PROD_CAT_FK FOREIGN KEY (CATEGORY_ID)
REFERENCES CATEGORIES (CATEGORY_ID);


CREATE SEQUENCE SHOP_SEQUENCE START WITH 1 INCREMENT BY 1 CACHE 20;