CREATE TABLE USERS
(
ID  NUMBER(6) NOT NULL,
LOGIN VARCHAR2(25) NOT NULL,
PASSWORD VARCHAR2(25) NOT NULL,
FIRST_NAME VARCHAR2(25) NOT NULL,
LAST_NAME VARCHAR2(25) NOT NULL,
EMAIL VARCHAR2(40) NOT NULL,
PHONE_NUMBER VARCHAR2(25) NOT NULL,
ADRESS_ID NUMBER(6)
);

CREATE TABLE CARTS
(
ID  NUMBER(6) NOT NULL,
USER_ID NUMBER(6) NOT NULL,
PRODUCT_ID NUMBER(6) NOT NULL
);

CREATE TABLE CATEGORYS
(
ID  NUMBER(6) NOT NULL,
NAME VARCHAR2(30) NOT NULL
);


CREATE TABLE PRODUCTS(
ID  NUMBER(6) NOT NULL,
NAME VARCHAR2(30) NOT NULL,
PRICE NUMBER(10,2) NOT NULL,
DESCRIPTION VARCHAR2(255),
IMAGE BLOB,
COUNT NUMBER NOT NULL,
CATEGORY_ID NUMBER(6) NOT NULL
);