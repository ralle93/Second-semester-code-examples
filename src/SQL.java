public class SQL {
   /**
    *
    Client/Server system - serveren er det ene sted hvor al dataen ligger, mens flere forskellige klienter (fx Workbench) kan bruge dataene fra databasen
    DBMS (Database Management System) - det program man bruger til at tilgå data i databasen (fx mySQL)
    SQL - Structured Query Language, det sprog man bruger til at kommunikere med databasen
    JDBC (Java Database Connectivity) den API (Application Programming Interface) man bruger i Java for at forbinde til databaser(et “framework”)
    Table (konceptuelt lidt det samme som en Class i Java; indeholder info om alle af samme slags ting)
    Row - hver række indeholder data om det enkelte element (lidt det samme som objekt i Java)
    Column - hver kolonne indeholder den samme type af info for alle elementer i tabellen - svarer til fields i Java
    Record - et fancy ord for row
    Datatype - beskriver hvilken type data der er i hver kolonne (eks: VARCHAR, INT, DateTime)
    Primary Key - data fra en række der unikt identificerer rækken (typisk id)
    Foreign Key - baseret på denne key kan man samle data fra flere forskellige tabeller
    Index - Primary Key er altid sat som Index, og man kan selv definere flere Index’er, hvis man fx vil kunne slå op på folks efternavne hurtigt - så har databasen lavet et opslagsværk
    Relationships (1:1, 1:m m:m) 1 til 1, 1 til mange, mange til mange. 1 spa kan have mange reservationer, men hver reservation passer kun til én spa (1 bruger kan bruge mange spa’er, og hver spa kan bruges af mange brugere (på forskellige tidspunkter)
    Query - forespørgsel/SQL-sætning
    Constraints - begrænsninger der gør at ikke alle mulige værdier er gyldige, fx NOTNULL, Unique
    Referential Integrity - hvis du refererer til et id fra en anden tabel, så skal det id også reelt findes i den anden tabel
    */
}
