# spring-boot-hibernate-oracle
spring boot project with hibernate and oracle (INSERT, DELETE, SELECT, DELETE) operations

- make sure that you create a user library and add ojdbc.jar driver. The jar is available in your 
local oracle installation directory (..//product//11.2.0//dbhome_1//jdbc//lib) or download it from web

#Products table sql

 CREATE TABLE "SIRA"."PRODUCTS1" 
   (	"ID" VARCHAR2(20 BYTE), 
	"DESCRIPTION" VARCHAR2(20 BYTE), 
	 CONSTRAINT "PRODUCTS1_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;

