public class SQL {
   /**
    *
    *
    SQL - Structured Query Language
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

    Database Normalization, or simply normalization, is the process of organizing the columns (attributes) and tables (relations) of a relational database to reduce data redundancy and improve data integrity.
    Normalization is also the process of simplifying the design of a database so that it achieves the optimum structure. It reduces and eliminates redundant data. In normalization, data integrity is assured. It was first proposed by Dr. Edgar F. Codd, as an integral part of a relational model.
    Schema - man kan erstatte "CREATE DATABASE" med "CREATE SCHEMA" Så det betyder basicly det samme når man snakker MySQL

    Inner Joins:
    When to use Inner Join?
    Join 2 tables
    Join more than 2 tables
    NATURAL JOIN

    Outer Joins
    How is it done?
    When to use it?

    Aggregate Functions
    GROUP BY
    HAVING
    HAVING vs WHERE

    When to use Subqueries?
    Subqueries in the WHERE clause
    The IN operator
    What type of result can a Subquery return?
    Subqueries vs Inner Join

    String functions (Fig. 9-1 in [2])
    Numeric functions (Fig. 9-5 [2])
    Get current Date/Time

    Designing a data structure (Fig. 10-1 [2]) - en samling af data der ikke kun er primitive typer (fx et Member fra DelfinProjekt, et HashSet eller LinkedList)
    Normalization - man skal (ideelt set) ikke have den samme data flere steder i databasen/schema
    1NF - hvert felt må kun indeholde 1 værdi, der skal være uopdelelig (atomisk) (fx ikke at skrive navn og adresse i samme felt)
    2NF - necessary and sufficient Primary Key(s) (eks: man skal bruge alle tre felter i reservations (i spa database) for at finde den enkelte reservation, og alle tre felter er altid nok)
    3NF - der er ikke nogen felter hvis indhold afhænger af noget andet end Primary Key (mod-eksempel: CPR, hvor “køn” både har sin egen kolonne og er afhængig af sidste ciffer)

    Why use Transaction?
    How to use Transaction
    Concurrency Problems
    Lost Updates
    Dirty Reads
    Commit
    Rollback
    Locking


    */
}
