set path=C:\\Ant\\bin;%path%;
set JAVA_HOME=C:\\Program Files\\Java\\jdk1.8.0_74

ant -Dbuild.xml -f test
@ rem sprint 1  targets 
@ rem test  HomePage  TireFinder  contactus  deals  servicesfinder  signin  vehicleselector

@ rem sprint 2  targets 
@ rem Filters  RecentlyViewed  SKUListing  SortPagination  TireLineListing  annoymous  browseandshop  dynamicvehicle   
@ rem nosearchresult  recommendation  registration SKUDetails mygarage

@ rem sprint 3 targets 
@ rem Account_pref  Cart  Credit_Card  TarailerFilter  TrailerTireLineListing  bookappointment  checkout  globle  


@rem test means Store Locator smoketest