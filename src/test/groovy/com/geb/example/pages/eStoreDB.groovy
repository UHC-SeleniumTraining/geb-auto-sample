package com.geb.example.pages

import groovy.sql.Sql

/**
 * Created by Naveen
 */


    def url = "jdbc:postgresql://localhost:5432/demo"
    def user = "postgres"
    def password = "test"
    def driver = "org.postgresql.Driver"
    def sql = Sql.newInstance(url, user, password, driver)


    sql.query('SELECT * FROM COMPANY') { resultSet ->

        while (resultSet.next()) {
            System.out.print(resultSet.getString(1) + " ")
            System.out.print(resultSet.getString(2) + " ")
            System.out.print(resultSet.getString(3) + " ")
            System.out.print(resultSet.getString(4) + " ")
            println()
        }
    }


    sql.close()
