package com.example.datacraft.run

case class RunArgs( command: String = "",
                    lifecycle: String = "",
                    parameters: Map[String, String] = _ )
