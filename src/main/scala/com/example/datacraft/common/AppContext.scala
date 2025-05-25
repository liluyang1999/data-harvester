package com.example.datacraft.common

import com.example.datacraft.common.Lifecycle.Lifecycle
import org.apache.spark.sql.SparkSession

object AppContext {

    val APPLICATION_NAME: String = "Data Harvester"

    val APPLICATION_VERSION: String = "1.0.0"

    def apply(): AppContext = {



        AppContext(

        )
    }

}

case class AppContext( sparkSession: SparkSession,
                       database: String,
                       command: String,
                       Lifecycle: Lifecycle,
                       parameters: Map[String, String] )
