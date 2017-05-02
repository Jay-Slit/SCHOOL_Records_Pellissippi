select sysdate from dual;
set echo on;
set define off;

-- Cameron Justice
-- SQL Lab 2 Textbook Practice Commands
-- CITC 1303

-- #7 p. 256-257
SELECT * FROM PRODUCT;
SELECT P_CODE,P_DESCRIPT,P_INDATE,P_QOH,P_MIN,P_PRICE,P_DISCOUNT,V_CODE
  FROM PRODUCT;
  
-- #8 p. 260 - 270
SELECT P_DESCRIPT,P_INDATE,P_PRICE,V_CODE 
  FROM PRODUCT
  WHERE V_CODE = 21344;
SELECT P_DESCRIPT, P_INDATE, P_PRICE, V_CODE
  FROM PRODUCT
  WHERE V_CODE != 21344;
SELECT P_DESCRIPT, P_QOH,P_MIN,P_PRICE
  FROM PRODUCT
  WHERE P_PRICE <= 10;
SELECT P_CODE, P_DESCRIPT,P_QOH,P_MIN,P_PRICE
  FROM PRODUCT
  WHERE P_CODE < '1558-QW1';
SELECT P_DESCRIPT,P_QOH,P_MIN, P_PRICE, P_INDATE
  FROM PRODUCT
  WHERE P_INDATE >= '20-Jan-2014';
SELECT P_DESCRIPT,P_QOH,P_PRICE,P_QOH * P_PRICE
  FROM PRODUCT;
SELECT P_DESCRIPT,P_QOH,P_PRICE,P_PRICE,P_QOH * P_PRICE AS TOTALVALUE
  FROM PRODUCT;
SELECT P_CODE, P_INDATE, SYSDATE - 90 AS CUTDATE
  FROM PRODUCT
  WHERE P_INDATE <= SYSDATE - 90;
SELECT P_CODE,P_INDATE,P_INDATE + 90 AS EXPDATE
  FROM PRODUCT;
SELECT P_DESCRIPT, P_INDATE, P_PRICE, V_CODE
  FROM PRODUCT
  WHERE V_CODE = 21344 OR V_CODE = 24288;
SELECT P_DESCRIPT, P_INDATE, P_PRICE, V_CODE
  FROM PRODUCT
  WHERE P_PRICE < 50
  AND P_INDATE > '15-Jan-2014';
SELECT P_DESCRIPT, P_INDATE, P_PRICE, V_CODE
  FROM PRODUCT
  WHERE (P_PRICE < 50 AND P_INDATE > '15-Jan-2014')
  OR V_CODE = 24288;
SELECT *
  FROM PRODUCT
  WHERE NOT(V_CODE = 21344);
SELECT *
  FROM PRODUCT
  WHERE P_PRICE BETWEEN 50.00 AND 100.00;
SELECT P_CODE,P_DESCRIPT,V_CODE
  FROM PRODUCT
  WHERE V_CODE IS NULL;
SELECT P_CODE,P_DESCRIPT,P_INDATE
  FROM PRODUCT
  WHERE P_INDATE IS NULL;
SELECT V_NAME,V_CONTACT,V_AREACODE,V_PHONE
  FROM VENDOR
  WHERE V_CONTACT LIKE 'Smith%';
SELECT V_NAME, V_CONTACT,V_AREACODE,V_PHONE
  FROM VENDOR
  WHERE V_CONTACT LIKE 'SMITH%';
SELECT V_NAME,V_CONTACT,V_AREACODE,V_PHONE
  FROM VENDOR
  WHERE UPPER(V_CONTACT) LIKE 'SMITH%';
SELECT V_NAME,V_CONTACT,V_AREACODE,V_PHONE
  FROM VENDOR
  WHERE V_CONTACT NOT LIKE 'Smith%';
SELECT * 
  FROM VENDOR
  WHERE V_CONTACT LIKE 'Johns_n';
SELECT *
  FROM PRODUCT
  WHERE V_CODE IN (21344, 24288);
SELECT *
  FROM PRODUCT
  WHERE V_CODE IN ('21344','24288');
SELECT V_CODE, V_NAME
  FROM VENDOR
  WHERE V_CODE IN(SELECT V_CODE FROM PRODUCT);
SELECT *
  FROM VENDOR
  WHERE EXISTS(SELECT * FROM PRODUCT WHERE P_QOH <= P_MIN);
SELECT *
  FROM VENDOR
  WHERE EXISTS(SELECT * FROM PRODUCT WHERE P_QOH < P_MIN * 2);