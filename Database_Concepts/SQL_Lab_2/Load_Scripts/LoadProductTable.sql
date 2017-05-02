-- Script that populates the product table with data for lab 2

set echo on
set define off

insert into product 
  values('14-Q1/L3','9.00-in., pwr. saw','13-Nov-13',18,12,17.49,0.00,21344);
insert into product 
  values ('1546-QQ2','Hrd. cloth, 1/4-in., 2x50','15-Jan-14',15,8,39.92,0.00,23119);
insert into product 
  values ('1558-QW1','Hrd. cloth, 1/2-in., 3x50','15-Jan-14',23,5,43.99,0.00,23119);
insert into product 
  values ('2232/QTY','B&D jigsaw, 12-in. blade','30-Dec-13',8,5,109.92,0.05,24288);
insert into product
  values ('2232/QWE','B&D jigsaw, 8-in. blade','24-Dec-13',6,5,99.87,0.05,24288);
insert into product 
  values ('2238/QPD','B&D cordless drill, 1/2-in.','20-Jan-14',12,5,38.95,0.05,25595);
insert into product 
  values ('23109-HB','Claw hammer','20-Jan-14',23,10,9.95,0.10,21225);
insert into product
  values ('23114-AA','Sledge hammer, 12 lb.','02-Jan-14',8,5,14.40,0.05,NULL);
insert into product 
  values ('54778-2T','Rat-tail file, 1/8-in. fine','15-Dec-13',43,20,4.99,0.00,21344);
insert into product 
  values  ('89-WRE-Q','Hicut chain saw, 16 in.','07-Feb-14',11,5,256.99,0.05,24288);
insert into product 
  values  ('PVC23DRT','PVC pipe,3.5-in., 8-ft.','20-Feb-14',188,75,5.87,0.00,NULL);
insert into product 
  values  ('SM-18277','1.25-in. metal screw, 25','01-Mar-14',172,75,6.99,0.00,21225);
insert into product 
  values ('SW-23116','2.5-in. wd. screw, 50','24-Feb-14',237,100,8.45,0.00,21231);
insert into product values 
 ('WR3/TT3','Steel matting, 4''x8''x1/6", .5" mesh','17-Jan-14',18,5,119.95,0.10,25595);

commit;

